package com.inheritance.things;

public class Chicken {
	public String type;
	public double price;
	public String gender;
	public int quantity;
	public String use;
	public String breed;
	public int lifespan;
	public String rank;
	public String quality;
	public String color;
	
public 	Chicken()
{
	System.out.println("Created a with no args cons.......");
}


public Chicken(String type, double price, String gender, int quantity, String use, String breed, int lifespan,
		String rank, String quality, String color) {
	super();
	this.type = type;
	this.price = price;
	this.gender = gender;
	this.quantity = quantity;
	this.use = use;
	this.breed = breed;
	this.lifespan = lifespan;
	this.rank = rank;
	this.quality = quality;
	this.color = color;
}


public void Nonveg()
{
	System.out.println("Running a Chicken");
	System.out.println("Bull type:"+type);
	System.out.println("Bull price:"+price);
	System.out.println("Bull gender:"+gender);
	System.out.println("Bull quantity:"+quantity);
	System.out.println("Bull use:"+use);
	System.out.println("Bull breed:"+breed);
	System.out.println("Bull lifespan:"+lifespan);
	System.out.println("Bull rank:"+rank);
	System.out.println("Bull quality:"+quality);
	System.out.println("Bull color:"+color);
}


}
