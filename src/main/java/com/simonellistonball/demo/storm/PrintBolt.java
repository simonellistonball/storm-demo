package com.simonellistonball.demo.storm;

import java.util.Map;

import org.apache.log4j.Logger;

import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

@SuppressWarnings("serial")
public class PrintBolt extends BaseBasicBolt {

	public static Logger LOG = Logger.getLogger(PrintBolt.class);
	
	@SuppressWarnings("rawtypes")
	@Override
    public void prepare(Map stormConf, TopologyContext context) {
    }
	
	public void execute(Tuple input, BasicOutputCollector collector) {
		LOG.info(input);
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
	}

}
