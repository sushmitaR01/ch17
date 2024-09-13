package com.xworkz.chaining.examples;

public class jioInternetProvider extends InternetProvider{
	public jioInternetProvider(String name, String CEOname) {
		super(name,CEOname);
		System.out.println("Created a cons in a jioInternetProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a jioInternetProvider ...");
	}

}
