package com.xworkz.equals.things;

public class Kettle {
	
	
	private String brand;
	private int quantity;
	private double price;
	private String color;
	private int volts;
	private String material;
	public Kettle(String brand, int quantity, double price, String color, int volts, String material) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.color = color;
		this.volts = volts;
		this.material = material;
	}
	public Kettle(String brand, int quantity, double price) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Kettle)
			{
				Kettle casted=(Kettle)obj;
				if(this.brand.equals(casted.brand)&& this.quantity==casted.quantity&&this.price==casted.price)
				{
					System.out.println("if LHS is equals to RHS ");
					return true;
				}
			}
			else {
				System.out.println("Object is null");
			}
		}
		else {
			System.out.println("Object is not null");
		}
		return super.equals(obj);
	}
		@Override
		public String toString() {
			return "Kettle [brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", color=" + color
					+ ", volts=" + volts + ", material=" + material + "]";
		}
		
	}
	
	
	
		
	
	
	
	


