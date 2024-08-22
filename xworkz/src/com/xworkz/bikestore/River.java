package com.xworkz.bikestore;

public class River {
	
	private String[] rivernames=new String[7];
	private int index=0;
	
	
	public void save(String name)
	{
		System.out.println("Created a River using string...............");
		this.rivernames[this.index]=name;
		index++;
		
		
		
	}
	
	public void ShowNames()
	{
		System.out.println("River names");
		for(String name:rivernames)
		{
			System.out.println("River Names:"+name);
	
		}
	}

}
