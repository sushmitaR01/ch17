package com.xworkz.standards.internal;

import com.xworkz.standards.Laptop;

public class Staff {
	Laptop laptop=new Laptop();
	
	public Laptop getlaptop()
	{
		System.out.println("Running in a Staff ");
		return this.laptop;
	}
	
	public void takePrintOut()
	{
		System.out.println("printer.getBrand"); //print HP
		//laptop.setBrand("DELL");
	}

}
