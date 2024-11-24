package com.xworkz.test;

public class Train {

	private String name;
	private String source;
	private String destination;
	private String via;
	
	public Train() {
		System.out.println("Created a no arg cons");
	}
	

	


	public Train(String name, String source, String destination, String via) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.via = via;
	}
	public Train(String name, String source) {
		super();
		this.name = name;
		this.source = source;
	}
	
	
	
	
}
