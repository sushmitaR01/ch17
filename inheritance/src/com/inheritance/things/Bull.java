package com.inheritance.things;

public class Bull {
	public String type;
	public double price;
	public String gender;
	public int noOfBulls;
	public String use;
	
public 	Bull()
{
	System.out.println("Created a with no args cons.......");
}

public Bull(String type, double price, String gender, int noOfBulls, String use) {
	super();
	System.out.println("Created a with parm cons........");
	this.type = type;
	this.price = price;
	this.gender = gender;
	this.noOfBulls = noOfBulls;
	this.use = use;
}
public void fighting()
{
	System.out.println("Running a Bull");
	System.out.println("Bull type:"+type);
	System.out.println("Bull price:"+price);
	System.out.println("Bull gender:"+gender);
	System.out.println("Bull noOfBulls:"+noOfBulls);
	System.out.println("Bull use:"+use);
}

}
