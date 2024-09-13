package com.xworkz.chaining.examples;

public class DellProvider extends Provider {
	public DellProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons using DellProvider two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a  DellProvider BookingProvider ...");
	}
	
}
