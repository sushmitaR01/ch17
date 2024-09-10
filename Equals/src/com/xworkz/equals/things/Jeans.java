package com.xworkz.equals.things;

public class Jeans {
	
	private String brand;
	private double price;
	private int size;
	private String material;
	private int noOfPockets;
	private String color;
	
	
	
	public Jeans(String brand, double price, int size, String material, int noOfPockets, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.material = material;
		this.noOfPockets = noOfPockets;
		this.color = color;
	}

	public Jeans(String brand, double price, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	
	

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setNoOfPockets(int noOfPockets) {
		this.noOfPockets = noOfPockets;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    
    @Override
    public boolean equals(Object obj)
    {
    	if(obj!=null)
    	{
    		if(obj instanceof Jeans) {
    			Jeans casted=(Jeans)obj;
    			
    			if(this.size==casted.size && this.color.equals(casted.color) && this.material.equals(casted.material) )
    			{
    				System.out.println("left hand side is equals to RHS");
    				return true;
    			}
    		
    		}
    		else {
        		System.out.println("Object is not null");
        		
        	}
    	}
    	else {
    		System.out.println("Object is null");
    	}
    	
    	
    	
    	
    	
    	
    	return super.equals(obj);
    }
    @Override
	public String toString() {
		return "Jeans [brand=" + brand + ", price=" + price + ", size=" + size + ", material=" + material
				+ ", noOfPockets=" + noOfPockets + ", color=" + color + "]";
	}

	
			
}
