package com.Array.bicycle.data;

public class SideDishData {
	
	 private String name;
	 private double price;
	 private String type;
	 
	 
	 
	public SideDishData(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	 public void shows()
	 {
		 System.out.println("Sidedish name:"+name);
		 System.out.println("Sidedish price:"+price);

		 System.out.println("Sidedish type:"+type);

	 }
	 

}
