Storm Demo
==========

Some simple storm demos.

This is the basic starting point. The goal is to implement a simple hello world topology. This is achieved by having the HelloSpout emit the "hello world" text. This will be printed to a log file by the PrintBolt. 

Once the Spout and Bolt are implemented, the topology is built in the main method of the StormDemo class. 

To run this against a sandbox cluster, copy the included storm.yaml file to your ~/.storm/ folder and ensure the nimbus port on your sandbox is open (usually 6627).

A fully implemented will be available on a different branch of this repo.
