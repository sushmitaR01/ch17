package com.xworkz.chaining.examples;

public class LenovoProvider extends Provider{
	private double profit;

	public LenovoProvider(String name, String CEOname,double profit) {
		super(name,CEOname);
		this.profit=profit;
		System.out.println("Created a cons in a LenovoProvider using two String");
	}
	
	@Override
	public   void service()
	{
		System.out.println("Running in  a LenovoProvider ...");
	}
	
	public void show() {
		System.out.println("profit is :"+profit);
	}
	
}
