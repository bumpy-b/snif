package stream.tuple;

public class Max extends AggregationFunction<Tuple> {
	private int aggregateField;
	private int tupleTypeID;
	
	//  ... "packets" "PacketsLastEpoch" 
	public Tuple invoke(Tuple aggregate, Tuple value) {
		if (aggregate == null) {
			Tuple tuple = Tuple.createTuple(tupleTypeID);
			tuple.setIntAttribute(aggregateField, 0);
			return tuple;
		} else {
			Math.max(aggregate.getIntAttribute(aggregateField), (Integer) value.getAttribute(aggregateField));
			aggregate.setIntAttribute(aggregateField, 1 + aggregate.getIntAttribute(aggregateField));
			return aggregate;
		}
	}
	public Max( String newTupleType, String resultField) {
		tupleTypeID = Tuple.getTupleTypeID( newTupleType);
		aggregateField = Tuple.getAttributeId(resultField);
	}
}