package com.simonellistonball.demo.storm;

import java.util.Map;

import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

@SuppressWarnings("serial")
public class PrintBolt extends BaseBasicBolt {

	@SuppressWarnings("rawtypes")
	@Override
    public void prepare(Map stormConf, TopologyContext context) {
    }
	
	public void execute(Tuple input, BasicOutputCollector collector) {
		// TODO Auto-generated method stub
		
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}

}
