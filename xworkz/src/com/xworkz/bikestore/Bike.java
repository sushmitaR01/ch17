package com.xworkz.bikestore;

public class Bike {
	private String[] ref= new String[7];
	private int index=0;
	
	
	
	public void save(String name)
	{
		System.out.println("Created a Bike using a String...............");
		this.ref[this.index]=name;
		index++;
		
	}
	
	public void showNames()
	{
		System.out.println("showing a names");
		for(String name:this.ref)
		{
			System.out.println("Bike name:"+name);
		}
	}

}
