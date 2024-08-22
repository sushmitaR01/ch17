package com.xworkz.bikestore;

public class City {
	
	private String[] citynames=new String[7];
	private int index=0;
	
	
	public void save(String name)
	{
		System.out.println("Created a city using string...............");
		this.citynames[this.index]=name;
		index++;
		
		
		
	}
	
	public void ShowNames()
	{
		System.out.println("city names");
		for(String name:citynames)
		{
			System.out.println("city Names:"+name);
	
		}
	}
}
