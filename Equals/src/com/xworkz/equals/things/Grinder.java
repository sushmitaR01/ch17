package com.xworkz.equals.things;

public class Grinder {
	
	private String material;
	private String brand;
	private String color;
	private int itemWeight;
	private double price;
	public Grinder(String material, String brand, String color, int itemWeight, double price) {
		super();
		this.material = material;
		this.brand = brand;
		this.color = color;
		this.itemWeight = itemWeight;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object anObject) {
		if(anObject!=null) {
			if (anObject instanceof Grinder) {
				Grinder casted =(Grinder)anObject;
				
				if(this.material.equals(casted.material)&&this.brand.equals(casted.brand)&&this.color.equals(casted.color))
				{
					System.out.println("LHS is equals to the RHS");
					return true;
				}
				else {
					System.out.println("Object is null");
				}
			}
		}
		else {
			System.out.println("Object is not null");
		}
		
		
		return brand.equals(anObject);
	}
	@Override
	public String toString() {
		return "Grinder [material=" + material + ", brand=" + brand + ", color=" + color + ", itemWeight=" + itemWeight
				+ ", price=" + price + "]";
	}
	
	
 

}
