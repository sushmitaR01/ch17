package com.inheritance.things;

public class Halwa {
	public String typeOfDense;
	public double price;
	public int quantity;
	
	public Halwa()
	{
		System.out.println("Created a Halwa with no args cons.....");
	}
	public Halwa(String typeOfDense, double price, int quantity)
	{
		this.typeOfDense=typeOfDense;
		this.price=price;
		this.quantity=quantity;
	}
	public void carrothalwa()
	{
		System.out.println("Running a Halwa");
		System.out.println(" Halwa typeOfDense: "+typeOfDense);
		System.out.println(" Halwa price: "+price);
		System.out.println(" Halwa quantity: "+quantity);
		
	}
	

}
