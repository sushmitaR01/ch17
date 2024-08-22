package com.xworkz.bikestore;

public class Dam {
	
	private String[] Damnames=new String[7];
	private int index=0;
	
	
	public void save(String name)
	{
		System.out.println("Created a Dam using string...............");
		this.Damnames[this.index]=name;
		index++;
		
		
		
	}
	
	public void ShowNames()
	{
		System.out.println("Dam names");
		for(String name:Damnames)
		{
			System.out.println("Dam Names:"+name);
	
		}
	}


}
