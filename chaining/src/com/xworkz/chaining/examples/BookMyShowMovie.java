package com.xworkz.chaining.examples;

public class BookMyShowMovie extends BookingProvider{
	
	public BookMyShowMovie(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a BookMyShowMovie using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a BookMyShowMovie ...");
	}
	
	public void book()
	{
		System.out.println("Running book in a BookMyShowMovie");
	}
	public void cancle() {
		System.out.println("Running cancle in a BookMyShowMovie");
	}	
	
}


