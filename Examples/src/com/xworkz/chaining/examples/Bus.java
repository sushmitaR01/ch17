package com.xworkz.chaining.examples;
//super() chaining

public class Bus {
	
	private int busno;
	private String source;
	private String destination;
	

	public Bus(int busno, String source, String destination) {
		super();
		this.busno = busno;
		this.source = source;
		this.destination = destination;
	}


	public Bus(int trainNo, String destination) {
		super();
		this.busno=busno;
		this.destination = destination;
	}
	
	public void display()
	{
		System.out.println("busno No:"+this.busno);
		System.out.println("Source:"+this.source);
		System.out.println("Destination :"+this.destination);
	}
	
	
	
	

}
