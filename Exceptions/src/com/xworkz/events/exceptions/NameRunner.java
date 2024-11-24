package com.xworkz.events.exceptions;

public class NameRunner extends Exception {

	public static void main(String[] args) {

		try {
			throw new NameException("Sushmita");
			
		}

		catch (NameException e) {
			System.out.println("Get the name");
		}
	

	}
}
