package com.xworkz.equals.things;

public class Saree {
	private String brand;
	private String material;
	private double price;
	private int quantity;
	private String color;
	public Saree(String brand, String material, double price, int quantity, String color) {
		super();
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Saree [brand=" + brand + ", material=" + material + ", price=" + price + ", quantity=" + quantity
				+ ", color=" + color + "]";
	}
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof Saree) {
				Saree casted=(Saree)obj;
				if(this.brand.equals(casted.brand)&&this.material.equals(casted.material)&&this.price==casted.price)
				{
					System.out.println("LHS is equals to RHS");
					return true;
				}
				else {
					System.out.println("object is not null");
				}
			}
			else {
				System.out.println("object is null");
			}
		}
		return brand.equals(obj);
	}
	
	

}
