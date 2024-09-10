package com.xworkz.equals.things;

public class Gun {
	private String brand;
	private int noOfBullets;
	private double price;
	private String ActionType;
	private int Weight;
	private int Range;
	public Gun(String brand, int noOfBullets, double price, String actionType, int weight, int range) {
		super();
		this.brand = brand;
		this.noOfBullets = noOfBullets;
		this.price = price;
		this.ActionType = actionType;
		this.Weight = weight;
		this.Range = range;
	}
	@Override
	public String toString() {
		return "Gun [brand=" + brand + ", noOfBullets=" + noOfBullets + ", price=" + price + ", ActionType="
				+ ActionType + ", Weight=" + Weight + ", Range=" + Range + "]";
	}
	public boolean equals(Object anObject) {
		if(anObject!=null) {
			if(anObject instanceof Gun) {
				Gun casted=(Gun)anObject;
				if(this.brand.equals(casted.brand)&&this.noOfBullets==casted.noOfBullets&&this.price==casted.price) {
					System.out.println("LHS is equal to the RHS");
					return true;
				}
				else {
					System.out.println("Object is not a null");
				}
				
			}
			
			
			
				else {
					System.out.println("Object is null");
				}
			}
		
		
		return ActionType.equals(anObject);
	}
	
	
	
	

}
