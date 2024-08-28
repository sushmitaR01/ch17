package com.xworkz.datatypes.things;

public class Shoe {
	public String brand="Bata";
	public double cost=1000;
	
	public Shoe()
	{
		System.out.println("Created a Shoe with no arg cons....");
	}
	
    public void safeGuard()
    {
    	System.out.println("Running in a Shoe");
    }
    public void enhanceWalk()
    {
    	System.out.println("Running in a shoe with a enhanceWalk");
    }
}
