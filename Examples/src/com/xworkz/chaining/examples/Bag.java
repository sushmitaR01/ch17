package com.xworkz.chaining.examples;
//this() chaining


public class Bag {
	
	private String brand;
	private double price;
	private String color;
	private int quantity;
	public Bag(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Bag(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public Bag(String brand, double price, String color, int quantity) {
		this(brand,price,color);
		
		this.quantity = quantity;
	}
	
	public void details()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("color:"+color);
		System.out.println("quantity:"+quantity);
		
	}
	

}
