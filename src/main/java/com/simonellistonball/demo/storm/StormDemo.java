package com.simonellistonball.demo.storm;

import backtype.storm.Config;
import backtype.storm.StormSubmitter;
import backtype.storm.generated.AlreadyAliveException;
import backtype.storm.generated.InvalidTopologyException;
import backtype.storm.topology.TopologyBuilder;

public class StormDemo {
	public void main(String[] args) throws AlreadyAliveException, InvalidTopologyException {
		TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("spout", new HelloSpout());
        builder.setBolt("bolt", new PrintBolt()).shuffleGrouping("spout");
        
        Config config = new Config();
        config.setDebug(false);
        config.setNumWorkers(2);
        	
    	StormSubmitter.submitTopology("testing", config, builder.createTopology());	
	}
}
