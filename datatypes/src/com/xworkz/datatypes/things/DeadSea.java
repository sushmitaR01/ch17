package com.xworkz.datatypes.things;

public class DeadSea {
	public Valleys valleys;
	
	public void seaAnimals()
	{
		if(valleys!=null) {
		valleys.rocks();
		valleys.sediment();
		valleys.types("Hillslope");
		System.out.println(valleys.gravity);
		System.out.println(valleys.type);
		System.out.println(valleys.depth);
		}
		else {
			System.out.println("valleys is null");
		}
	}

}
