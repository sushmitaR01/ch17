package com.xworkz.equals.things;

public class Bedsheet {
	
	private String material;
	private String color;
	private double price;
	private int quantity;
	private boolean iswashable;
	private  String Quality;
	public Bedsheet(String material, String color, double price, int quantity, boolean iswashable, String quality) {
		super();
		this.material = material;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.iswashable = iswashable;
		Quality = quality;
	}
	@Override
	public String toString() {
		return "Bedsheet [material=" + material + ", color=" + color + ", price=" + price + ", quantity=" + quantity
				+ ", iswashable=" + iswashable + ", Quality=" + Quality + "]";
	}
	public boolean equals(Object anObject) {
		
		if (anObject!=null) {
			if(anObject instanceof Bedsheet) {
				Bedsheet casted=(Bedsheet)anObject;
				if(this.material.equals(casted.material)&&this.color.equals(casted.color)&&this.price==casted.price) {
					System.out.println("LHS is equals to the RHS");
					return true;
				}
				else {
					System.out.println("Object is  null");
				}
			}
			else {
				System.out.println("Object is  null");
			}
		}
		return color.equals(anObject);
	}
	
	
}
