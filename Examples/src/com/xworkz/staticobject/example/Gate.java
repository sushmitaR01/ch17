package com.xworkz.staticobject.example;
// static block
public class Gate {
	
	static int noOfgrills;
	static String color;
	
	static {
		noOfgrills=20;
		color="Black";
		 System.out.println("Static block executed.");
		 
}
	public Gate() {
		System.out.println("Created a Gate with no arg cons");
		
		
	}
	
	public void display() {
		System.out.println("Displayinggg...");
        System.out.println("No Of Grills: " + noOfgrills);
        System.out.println("Color Of Gate: " + color);
	}

}
