package com.xworkz.equals.things;

public class Helmet {

	
	
	private double price;
	private String color;
	private String company;
	private int weight;
	private int warranty;
	private char size;
	public Helmet(double price, String color, String company, int weight, int warranty, char size) {
		super();
		this.price = price;
		this.color = color;
		this.company = company;
		this.weight = weight;
		this.warranty = warranty;
		this.size = size;
	}
	@Override
		public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Helmet ) {
				Helmet helmet=(Helmet)obj;
				if(this.price==helmet.price&& this.weight==helmet.weight&&this.warranty==helmet.warranty ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no helmet ");
			}
				
		}
			else {
				System.out.println("obj is null");
			}
		
	}
			return super.equals(obj);
		}
	@Override
	public String toString() {
		return "Helmet [price=" + price + ", color=" + color + ", company=" + company + ", weight=" + weight + ", warranty="
				+ warranty + ", size=" + size + "]";
	}

	}

