package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Plain;
import com.xworkz.datatypes.things.Erosion;
import com.xworkz.datatypes.things.Valleys;
import com.xworkz.datatypes.things.DeadSea;

public class ValleyRunner {

	public static void main(String[] args) {
		Plain plain=new Plain();
		plain.earth();
		
		Erosion erosion=new Erosion();
		Valleys valleys1=new Valleys(20);
		erosion.soil(valleys1);
		
		
		DeadSea deadSea=new DeadSea();
		Valleys valleys2=new Valleys();
		deadSea.valleys=(valleys2);
		
		
	}

}
