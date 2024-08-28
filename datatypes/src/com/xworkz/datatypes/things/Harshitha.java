package com.xworkz.datatypes.things;

public class Harshitha {
	
	public Shoe shoe;
	
	public void wearing()
	{
		if(shoe!=null) {
		shoe.enhanceWalk();
		shoe.safeGuard();
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
		}
		else {
			System.out.println("Shoe is null");
		}
		
		
	}
	

}
