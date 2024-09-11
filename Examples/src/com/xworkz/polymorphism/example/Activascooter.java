package com.xworkz.polymorphism.example;

public class Activascooter extends Scooter{
	
	public void good() {
		System.out.println("Running good in a Activascooter");
	}
	@Override
	public void horn() {
		System.out.println("Running horn in the Activascooter");
	}

}
