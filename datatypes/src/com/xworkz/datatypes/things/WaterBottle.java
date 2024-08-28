package com.xworkz.datatypes.things;

public class WaterBottle {
	
	public int quantity=1;
	public String color="Blue";
	
	public WaterBottle()
	{
		System.out.println("Created a fill  WaterBottle with no args cons....");
	}
	
	public void fill()
	{
		System.out.println("Running in anwaterbottle");
	}
    public void empty()

    {
    	System.out.println("Running crush in waterbottle");
    	
    }
    public void crush()
    {
    	System.out.println("Running crush in waterbottle");
    }
}
