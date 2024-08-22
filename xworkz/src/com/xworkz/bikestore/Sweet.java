package com.xworkz.bikestore;

public class Sweet {
	
	private String[] sweetnames=new String[7];
	private int index=0;
	
	
	public void save(String name)
	{
		System.out.println("Created a Sweet using string...............");
		this.sweetnames[this.index]=name;
		index++;
		
		
		
	}
	
	public void ShowNames()
	{
		System.out.println("Sweet names");
		for(String name:sweetnames)
		{
			System.out.println("Sweet Names:"+name);
		}
	}

}
