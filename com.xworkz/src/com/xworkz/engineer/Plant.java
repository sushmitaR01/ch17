package com.xworkz.engineer;

public class Plant {
	private String type;
	private int length;
	private int height;
	private int width;
	private String partuses;
	private String fruitName;
	private String flowerName;
	private String usedtoCure;
	private String localName;
	private String BotanicalName;
	
	
	
	public Plant(String type,int length,int height,int width,String partuses)
	{
		this.type=type;
		this.length=length;
		this.height=height;
		this.width=width;
		this.partuses=partuses;
		System.out.println("Created Plant using constructor");
		
	}
	
	public void setFruitName(String fruitName)
	{
		this.fruitName=fruitName;
		
				
	}
	
	public void setFlowerName(String flowerName)
	{
		this.flowerName=flowerName;
		
				
	}
	
	public void setUsedtoCure(String usedtoCure)
	{
		this.usedtoCure=usedtoCure;
		
				
	}
	
	public void setLocalName(String localName)
	{
		this.localName=localName;
		
     }
	public void setBotanicalName(String BotanicalName)
	{
		this.BotanicalName=BotanicalName;
		
     }
	
	public void display()
	{
		System.out.println("plant type:"+type);
		System.out.println("plant length:"+length);
		System.out.println("plant heigth:"+height);
		System.out.println("plant width:"+width);
		System.out.println("plant partuses:"+partuses);
		System.out.println("plant fruitName:"+fruitName);
		System.out.println("plant flowerName:"+flowerName);
		System.out.println("plant usedtoCure:"+usedtoCure);
		System.out.println("plant localName:"+localName);
		System.out.println("plant BotanicalName:"+BotanicalName);
		
	}
	

}
