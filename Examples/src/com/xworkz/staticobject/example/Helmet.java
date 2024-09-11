package com.xworkz.staticobject.example;
//class block
public class Helmet {
      String color;
      double price;
	public Helmet(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}
	void displayDetails() {
		
		System.out.println("Details...");
        System.out.println("Name: " + color);
        System.out.println("Price: " + price);
    }
}
