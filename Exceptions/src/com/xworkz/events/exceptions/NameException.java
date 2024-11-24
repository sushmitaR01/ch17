package com.xworkz.events.exceptions;

public class NameException extends Exception{
	
	String name;

	public NameException(String name) {
		super();
		this.name = name;
	}
	
}
