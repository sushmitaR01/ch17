package com.xworkz.datatypes.things;

public class Rajkumar {
	
	public Hat hat;
	
	public void fold()
	{
		if(hat!=null) {
		hat.shade();
		System.out.println(hat.color);
	}
		else {
			System.out.println("hat is null");
		}
	}
	

}
