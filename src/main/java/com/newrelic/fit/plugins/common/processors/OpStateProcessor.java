package com.newrelic.fit.plugins.common.processors;

public class OpStateProcessor implements MetricProcessor {

	Integer up = new Integer(1);
	Integer down = new Integer(0);
	
	@Override
	public Number process(String opState) throws MetricProcessingException {
		if (opState.equalsIgnoreCase("up")) {
			return up;
		} else {
			return down;
		}
	}
		
}
