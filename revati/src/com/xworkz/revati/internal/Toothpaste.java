package com.xworkz.revati.internal;

public class Toothpaste {
	
	private String company;
	private boolean salt;
	
	
	public Toothpaste(String company, boolean salt) {
		super();
		this.company = company;
		this.salt = salt;
		System.out.println("Created a cons using string and boolean");
	}


	public Toothpaste(String company) {
		super();
		this.company = company;
		System.out.println("Created a cons using string and ");;
	}
	public void display() {
		System.out.println("Running Display");
		System.out.println("Toothpaste company:"+company);
		System.out.println("Toothpaste salt:"+salt);
	}
	
	

}
