package packetparser;

public class DecodedPacket {

	PacketTemplate template;
	byte rawData[];
	int hashCode;
	
    private DecodedPacket(byte rawData[], PacketTemplate template){
    	this.rawData = rawData;
    	this.template = template;
    	calcHash();
    }
    
    private DecodedPacket( DecodedPacket other){
    	rawData = new byte[other.rawData.length];
    	System.arraycopy(other.rawData, 0, rawData, 0, other.rawData.length);
    	template = other.template;
    	calcHash();
    }
    
	private static PacketTemplate getNestedPacketTemplate( byte[] buffer, PacketTemplate packet) {
		for (PacketTemplate child : packet.extensions ) {
			// check for conditions 
			if (child.guardField == null) {
				return getNestedPacketTemplate(buffer,child);
			}
			Attribute attribute = child.guardField;
			if ( DecodedPacket.getInt(buffer, attribute.offset, attribute.type.size,
			TypeSpecifier.littleEndian) == child.guardValue) {
				// System.out.println("getNestedPacketTemplate: "+packet.typeName+" is a " + child.typeName);
				return getNestedPacketTemplate(buffer, child);
			}
		}
		return packet;
	}
	
	private static PacketTemplate getPacketTemplate(PDL parser, byte[] buffer) {
		PacketTemplate defPacket = parser.getDefaultPacket();
		return getNestedPacketTemplate(buffer, defPacket);
	}

	public static DecodedPacket createPacketFromBuffer( PDL parser, byte[] buffer) {
		PacketTemplate packet = getPacketTemplate(parser, buffer);
		if (packet == null) return null;
		return new DecodedPacket( buffer, packet);
	}



	private void calcHash() {
    	StringBuffer content = new StringBuffer();
    	for (int i = 0; i < rawData.length; i++) {
    		content.append( ".");
    		content.append( rawData[i]);
    	}
    	hashCode = content.toString().hashCode();
    	if (template != null) {
    		hashCode ^= template.hashCode();
    	}
    }
    
    public boolean equals(Object obj) {
    	if (! (obj instanceof DecodedPacket)) return false;
    	DecodedPacket packet = (DecodedPacket) obj;
    	return packet.hashCode == hashCode;
    }
    
    public int hashCode() {
    	return hashCode;
    }
    
    public int getByte( int offset) {
    	if (offset >= rawData.length) {
    		System.out.println("DecodedPacket error: access byte "+offset+" in\n"+toString());
    		System.exit(10);
    	}    	if (rawData[offset] >= 0) return rawData[offset];
    	return rawData[offset]+256;
    }
    
    public  Integer getIntAttribute( String attribute) {
    	Integer result = getIntAttribute( template, 0, attribute);
    	if (result == null) {
    		System.out.println("Cannot get attribute "+attribute + " for type " + template);
    		System.exit(10);
    	}
    	return result;
    }
    
    
	static public int getInt(byte buffer[], int offset, int size, boolean littleEndian) {
		if (offset + size > buffer.length)
			return -1;

		int step = 1;
		if (littleEndian) {
			offset += size - 1;
			step = -1;
		}
		int value = 0;
		while (size > 0) {
			int currByte = buffer[offset];
			if (currByte < 0) {
				currByte += 256;
			}
			value = (value << 8) + currByte;
			offset += step;
			size--;
		}
		return value;
	}

	
    private Integer getIntAttribute(PacketTemplate type, int offset, String attribute) {

    	// TODO match "(TypeName)" 

    	boolean arrayAccess = false;
    	boolean structAccess = false;

    	int dotPos = attribute.indexOf("."); 
    	int arrayPos = attribute.indexOf("[");
    	int arrayPos2 = attribute.indexOf("]");
    	
    	String field = attribute;
    	String rest = "";
    	String arrayIdx = "";
    	
    	if ( dotPos >= 0 && arrayPos >= 0) {
    		if (dotPos < arrayPos) {
    			structAccess = true;
        		field = attribute.substring( 0, dotPos);
        		rest = attribute.substring( dotPos+1);
    		} else {
    			arrayAccess = true;
    			structAccess = true;
        		field = attribute.substring(0, arrayPos);
        		arrayIdx = attribute.substring( arrayPos+1, arrayPos2);
        		rest = attribute.substring( dotPos+1);
    		}
    	} else if ( dotPos >= 0) {
    		structAccess = true;
    		field = attribute.substring( 0,dotPos);
    		rest = attribute.substring( dotPos+1);
    	} else if ( arrayPos >= 0) {
    		arrayAccess = true;
    		field = attribute.substring( 0,arrayPos);
    		arrayIdx = attribute.substring( arrayPos+1, arrayPos2 );
    		rest = "";
    	}
    	
    	if (structAccess) {
    		if (field.equals( type.typeName )) {
    			return getIntAttribute( type, offset, rest);
    		}
    		if ( type.isInstanceOf(field))
    			return getIntAttribute( type.getSuper(), offset, attribute);
    	}

		for (Object attObj : type.attributes) {
			Attribute att = (Attribute) attObj;
			if (att.name.equals(field)) {
				// add offset for access element in array
				if (arrayAccess) {
					offset += Integer.parseInt( arrayIdx) * att.type.size;
				}
				if (structAccess) {
					if ( rest.equals("length")) {
						if (att.elements >= 0) {
							return att.elements;
						}
						if (att.elements == PacketTemplate.variableSizedDirect) {
							return getInt( rawData, offset + type.lengthPos, type.lengthField.type.size, TypeSpecifier.littleEndian);
						}
						if (att.elements == PacketTemplate.variableSizedIndirect) {
							// get total (sub-)struct size
							int structSize = getIntAttribute( type.getSuper(), 0, type.expands.name+".length" );
							return ( structSize - type.packetSize ) / att.type.size;
						}
					}
					return getIntAttribute( (PacketTemplate) att.type, offset + att.offset, rest );
				}
				// add offset of "the" array if accessing values behind
				if (type.fixedLength == false && att.offset > type.lengthPos && att.elements > 0){
					offset += getInt( rawData, offset + type.lengthPos, type.lengthField.type.size, TypeSpecifier.littleEndian) * type.lengthMultiply;
				}
		    	return getInt( rawData, offset + att.offset, att.type.size, TypeSpecifier.littleEndian);
			}
		}
    	return null;
    }
    

	public boolean exists(String attribute) {
		return  getIntAttribute(template, 0, attribute) != null;
	}
	
	public byte [] getRaw(){
		return rawData;
	}
	
	public int getLength() {
		return rawData.length;
	}

	/*** toString ******/
	
	/**
	 * Prefix a number and append to buffer
	 * @param buffer
	 * @param chars
	 * @param hex
	 */
	private void appendHex( StringBuffer buffer, int chars, String hex) {
		for (int i=0; i < chars-hex.length(); i++) {
			buffer.append("0");
		}
		buffer.append(hex);
	}

	/**
	 * @param result
	 */
	private void appendData(StringBuffer result) {
		result.append( "\n");
		int offset = 0; 
		if (rawData != null && rawData.length > 0 ) {
			while (offset < rawData.length) {
				result.append("    ");
				appendHex(result, 4, ""+offset);
				result.append(":");
				int count = rawData.length - offset;
				if (count > 16) { count = 16; };
				for (int i = 0; i<count; i++) {
					result.append(" ");
					appendHex( result, 2, Integer.toHexString(getByte(offset++)));
				}
				result.append("\n");
			}
		}
	}
    public String toString() {
    	StringBuffer result = new StringBuffer();
    	appendData( result );
    	return template.typeName + " " + result.toString();
    }
    
    public String toStringPretty() {
    	StringBuffer result = new StringBuffer();
		dumpElement(result, template, 0, template.getTypeName(), "");
    	return result.toString();
    }
    
	private void dumpElement(StringBuffer result, PacketTemplate template, int byteOffset, String type, String prefix) {
		
		// parse parent (extension)
		if (template.parent != null) {
			dumpElement(result, template.parent, byteOffset, template.parent.typeName, prefix);
		}
		// add "." to prefix if used
		if (!prefix.equals("")) {
			prefix = prefix + ".";
		}
		
		for (Attribute att : template.attributes) {
			if (att.type instanceof PacketTemplate) {
				if (att.elements > 1 ) {
					for (int i =  0; i<att.elements; i++) {
						dumpElement(result, ((PacketTemplate) att.type), att.offset + byteOffset + i*att.type.size, type, prefix + att.name + "["+i+"]");
					}
				} else {
					dumpElement(result, ((PacketTemplate) att.type), att.offset + byteOffset, ((PacketTemplate) att.type).typeName, prefix + att.name);
				}
			} else {
				// all information available.. do something with it
				result.append ( "[" + type + "] " + prefix + att.name + " = " );
				for (int i = 0; i < att.elements; i++) {
					int value = getInt(rawData, byteOffset + att.offset + i * att.type.size, att.type.size,
							TypeSpecifier.littleEndian);
					result.append(value + " (0x"+Integer.toHexString(value)+")");
				}
				result.append("\n");
			}
		}
	}
	
	public static void main (String args[]) {
		PDL parser = Parser.readDescription("packetdefinitions/test.h");
		parser.printTypes();
		parser.printStructs();
		parser.printPackets();
		parser.printValues();

		byte aData[] =  { 5, 0, 1,  0, 2,  0, 3, 0, 4,  0,5,  0, 6 };
		DecodedPacket aPacket = DecodedPacket.createPacketFromBuffer(parser, aData);
		for (int i=0;i<5;i++) {
			System.out.println(aPacket.getIntAttribute("array["+i+"]"));
		}
		System.out.println(aPacket.getIntAttribute("crc"));
		
	}

	public PacketTemplate getTemplate() {
		return template;
	}

}
