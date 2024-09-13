package com.xworkz.chaining.examples;

public class BookMyShowMovieBookingProvider extends BookingProvider{
	private  int totalHalls;
	public BookMyShowMovieBookingProvider(String name, String CEOname,int totalHalls) {
		super(name,CEOname);
		this.totalHalls=totalHalls;
		System.out.println("Created a cons in a BookMyShowMovieBookingProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a BookMyShowMovieBookingProvider ...");
	}
	
}
