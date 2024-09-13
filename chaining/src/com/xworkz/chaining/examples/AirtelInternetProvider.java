package com.xworkz.chaining.examples;

public class AirtelInternetProvider extends InternetProvider{
	public AirtelInternetProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a AirtelInternetProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a AirtelInternetProvider ...");
	}

}
