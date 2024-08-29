package com.xworkz.datatypeswithclass.things;

public class Dog {
	
	private String  name;
	private String color;
	private String breed;
	
	public Dog()
	{
		System.out.println("Created a Dog Using non Arg cons...");
	}

	public Dog(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	public void barking()
	{
		System.out.println("Running Dog ..");
	}
	
	public void fetching()
	{
		System.out.println("Dog name:"+name);
		System.out.println("Dog color:"+color);
		System.out.println("Dog breed:"+breed);
		
		
	}
	

}
