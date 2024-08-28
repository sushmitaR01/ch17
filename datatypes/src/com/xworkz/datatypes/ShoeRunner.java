package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Divya;
import com.xworkz.datatypes.things.Harshitha;
import com.xworkz.datatypes.things.Omkar;
import com.xworkz.datatypes.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		Divya divya=new Divya();
		divya.wear();
		
		Omkar omkar=new Omkar();
		Shoe shoe1=new Shoe();
		omkar.tie(shoe1);
		
		
		Harshitha harshitha=new Harshitha(); 
		Shoe shoe2=new Shoe();
		harshitha.shoe=(shoe2);
		
		
		
		

	}

}
