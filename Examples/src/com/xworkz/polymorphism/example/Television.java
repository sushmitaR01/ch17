package com.xworkz.polymorphism.example;
//overloading
public class Television {
	
	private String brand;
	private double price;
	private boolean hd;
	
	
	public Television(String brand) {
		this.brand=brand;
	}
	
	public Television (double price) {
		this.price=price;
	}
	public Television (double price,boolean hd) {
		this.price=price;
		this.hd=hd;
	}
	
	public void watch(String brand) {
		System.out.println("Running a watch with a String");
	}
	public void watch(double price) {
		System.out.println("Running a watch with a double");
	}

}
