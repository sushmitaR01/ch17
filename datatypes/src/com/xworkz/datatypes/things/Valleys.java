package com.xworkz.datatypes.things;

public class Valleys {
	
	public String gravity="U-shaped";
	public String type;
	public int depth;
	
	public Valleys()
	{
		System.out.println("create a by using no arg cons..");
	}
	public Valleys(int depth)
	{
		System.out.println("create a by using int cons..");
		this.depth=depth;
	}
	public void rocks()
	{
		System.out.println("Running Valleys in rocks");
	}
	public void sediment()
	{
		System.out.println("Valley gravity:"+gravity);
		System.out.println("Valley type:"+type);
		System.out.println("Valley depth:"+depth);
		System.out.println("Running Valley in a sediment");
	}
	public void types(String type)
	{
		System.out.println("Running Valley in rivers");
	}
	

}
