package com.xworkz.things.toys;

public class Teddy {

	static {
		System.out.println("Created a static block in a Teddy");
	}
	{
		System.out.println("Created a non static block");
	}

}
