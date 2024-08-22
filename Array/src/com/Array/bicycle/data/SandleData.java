package com.Array.bicycle.data;

public class SandleData {
	private String brand;
	private char size;
	private double cost;
	private String color;
	
	
	
	public SandleData(String brand, char size, double cost, String color) {
		
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	
	public void display()
	{
		System.out.println("Sandle Brand:"+brand);
		System.out.println("Sandle size:"+size);
		System.out.println("Sandle cost:"+cost);
		System.out.println("Sandle color:"+color);
	}
	
	
	
	

}
