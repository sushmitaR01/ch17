package com.xworkz.polymorphism.example;

public class TelevisionRunner {

	public static void main(String[] args) {
		Television television1=new Television("LG");
		Television television2=new Television(25000, true);
		television1.watch("Samsung");
	}

}
