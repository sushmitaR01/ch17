package com.xworkz.datatypes.things;

public class Erosion {
	
	public void soil(Valleys valleys)
	{
		if(valleys!=null) {
		valleys.rocks();
		valleys.sediment();
		System.out.println(valleys.gravity);
		System.out.println(valleys.type);
		}
		else {
			System.out.println("valleys is null");
		}
	}

}
