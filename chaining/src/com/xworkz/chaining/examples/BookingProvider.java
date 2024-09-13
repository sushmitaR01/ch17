package com.xworkz.chaining.examples;

public class BookingProvider extends Provider{
	public BookingProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a BookingProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a BookingProvider ...");
	}
	
}
