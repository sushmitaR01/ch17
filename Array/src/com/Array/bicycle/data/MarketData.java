package com.Array.bicycle.data;

public class MarketData {
	
	private String name;
	private String location;
	
	
	public MarketData(String name, String location) {
		
		this.name = name;
		this.location = location;
	}
	public void show()
	{
		System.out.println("Market name:"+name);
		System.out.println("Market location:"+location);
	}

}
