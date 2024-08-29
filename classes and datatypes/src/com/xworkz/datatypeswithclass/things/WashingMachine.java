package com.xworkz.datatypeswithclass.things;

public class WashingMachine {
	
	private String brand;
	private String type;
	private int capacity;
	
	public WashingMachine()
	{
		System.out.println("Created a no args cons");
		
	}

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}
	public void rinse()
	{
		System.out.println("Running washingmachine");
	}
	public void show()
	{
		System.out.println("Washingmachine brand:"+brand);
		System.out.println("Washingmachine type:"+type);
		System.out.println("Washingmachine capacity:"+capacity);
	}
}
