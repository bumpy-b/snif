package stream.tuple;

import java.util.HashMap;

import stream.AbstractPipe;

public class TupleGroupAggregator extends AbstractPipe<Tuple, Tuple>{

	protected AggregationFunction<Tuple> aggregator;
	protected String groupField;
	protected int groupFieldID;
	protected HashMap<Object, Tuple> aggregates = new HashMap<Object,Tuple>();
	
	public void process(Tuple o, int srcID, long timestamp) {
		Object gID = o.getAttribute( groupFieldID);
		Tuple aggregate = aggregates.get(gID);
		if (aggregate == null) {
			aggregate = aggregator.invoke( null, null );
			aggregate.setAttribute( groupFieldID, gID);
			aggregates.put(gID, aggregate);
		}
		aggregator.invoke( aggregate, o);
		transfer( aggregate, timestamp);
	}

	public void dump() {
		System.out.println("ToupleGroupAggregator '"+name+"'");
		for (Tuple tuple: aggregates.values()) {
			System.out.println( tuple.toString() );
		}
	}
	
	/** hack to calculate the total quality of observations. only valid for a beacon ratio aggregator */
	public float getObservationQuality() {
		int minID = Tuple.registerTupleField("min");
		int maxID = Tuple.registerTupleField("max");
		int countID = Tuple.registerTupleField("count");

		long totalPackets = 0;
		long observedPackets = 0;
		for (Tuple tuple: aggregates.values()) {
			totalPackets += tuple.getIntAttribute(maxID) - tuple.getIntAttribute(minID) + 1;
			observedPackets += tuple.getIntAttribute(countID);
		}
		return ((float) observedPackets ) / ((float) totalPackets);
	}
	
	/**
	 * @param aggregator
	 * @param groupField
	 * @param operatorName TODO
	 */
	public TupleGroupAggregator(AggregationFunction<Tuple> aggregator, String groupField, String name) {
		this.name = name;
		this.aggregator = aggregator;
		this.groupField = groupField;
		groupFieldID = Tuple.getAttributeId( groupField);
	}
}
