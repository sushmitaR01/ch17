package com.xworkz.chaining.examples;

public class InternetProvider extends Provider{
	public InternetProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a InternetProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a InternetProvider ...");
	}
	
}
