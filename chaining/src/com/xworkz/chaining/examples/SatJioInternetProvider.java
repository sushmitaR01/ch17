package com.xworkz.chaining.examples;

public class SatJioInternetProvider extends InternetProvider{
	
	private double cost;
	private int date;
	
	
	public SatJioInternetProvider(String name, String CEOname,double cost,int date) {
		super(name,CEOname);
		this.cost=cost;
		this.date=date;
		
		System.out.println("Created a cons in a SatJioInternetProvider using two String");
	}
	@Override
	public   void service()
	{
		System.out.println("Running in  a SatJioInternetProvider ...");
	}
		public void display()
		{
			System.out.println("Cost is:"+cost);
			System.out.println("date is:"+date);
		}
	}


