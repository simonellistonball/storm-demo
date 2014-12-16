package com.simonellistonball.demo.storm;

import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;

@SuppressWarnings("serial")
public class HelloSpout extends BaseRichSpout {

	private SpoutOutputCollector _collector;

	public void nextTuple() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("rawtypes")
	public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
		_collector = collector;
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}

}
