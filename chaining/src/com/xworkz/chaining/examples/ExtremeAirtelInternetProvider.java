package com.xworkz.chaining.examples;

public class ExtremeAirtelInternetProvider extends InternetProvider{
	
	public ExtremeAirtelInternetProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a ExtremeAirtelInternetProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a ExtremeAirtelInternetProvider ...");
	}
}
