package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
		
		String user = "display"; 
		Client c = new Client(user, Common.BROKERHOST, Common.BROKERPORT);
		c.connect();
		
		c.createTopic(Common.TEMPTOPIC);
		c.subscribe(Common.TEMPTOPIC);
		for(int i = 0; i < COUNT; i++) {
		c.receive();
		
		}
		c.unsubscribe(Common.TEMPTOPIC);
		c.disconnect();
		// create a client object and use it to
		
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		
	}
}
