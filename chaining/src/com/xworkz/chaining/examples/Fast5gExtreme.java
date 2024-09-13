package com.xworkz.chaining.examples;

public class Fast5gExtreme extends InternetProvider{

	public Fast5gExtreme(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a Fast5gExtreme using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a Fast5gExtreme ...");
	}
	
}
