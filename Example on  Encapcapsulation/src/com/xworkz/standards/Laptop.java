package com.xworkz.standards;

public class Laptop {
	
	private boolean print=true;
	private String brand="HP";
	
	public boolean isPrint()
	{
		return this.print;
	}
	
	//giveBrand,getBrand,setBrand......etc
	public String getBrand()
	{
		return this.brand;
	}
	
	
	private  void setBrand()
	{
		this.brand=brand;
	}
	
	//access using methods
	//
	void setPrint(boolean print)
	{
		this.print=print;
	}

}
