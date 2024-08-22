package com.xworkz.engineer;

public class Ball {
	
	private String type;
	private int length;
	private int height;
	private int width;
	private int panel;
	private String manufacturer;
	private String shape;
	private String surfaceFinish;
	private String paneljointType;
	private int year;
	private String Brand;
	private String manufacOwner;
	private String manuIn;
	private String materialUsed;
	private String texture;
	private String durability;
	private String exportedTo;
	private String composation;
	private String weight;
	private String BallMadeOf;
	
	
	public Ball(String type,int length,int height,int width,int panel,String manufacturer,String shape,String surfaceFinish)
	{
		this.type=type;
		this.length=length;
		this.height=height;
		this.width=width;
		this.panel=panel;
		this.manufacturer=manufacturer;
		this.shape=shape;
		this.surfaceFinish=surfaceFinish;
		System.out.println("Created ball using constructor");
		
	}
	
	public void setpaneljointType(String paneljointType)
	{
		this.paneljointType=paneljointType;
		
				
	}
	public void setyear(int year)
	{
		this.year=year;
		
     }
	public void setBrand(String Brand)
	{
		this.Brand=Brand;
		
     }
	
	public void setmanufacOwner(String manufacOwner)
	{
		this.manufacOwner=manufacOwner;
		
     }
	
	public void setmanuIn(String manuIn)
	{
		this.manuIn=manuIn;
		
     }
	public void setmaterialUsed(String materialUsed)
	{
		this.materialUsed=materialUsed;
		
     }
	
	public void settexture(String texture)
	{
		this.texture=texture;
		
     }
	
	public void setdurability(String durability)
	{
		this.durability=durability;
		
     }
	public void setexportedTo(String exportedTo)
	{
		this.exportedTo=exportedTo;
		
     }
	
	public void setcomposation(String composation)
	{
		this.composation=composation;
		
     }
	
	public void setweight(String weight)
	{
		this.weight=weight;
		
     }
	
	public void setBallMadeOf(String BallMadeOf)
	{
		this.BallMadeOf=BallMadeOf;
		
     }
	
	public void display()
	{
		System.out.println("Ball type:"+type);
		System.out.println("Ball length:"+length);
		System.out.println("Ball heigth:"+height);
		System.out.println("Ball width:"+width);
		System.out.println("Ball panel:"+panel);
		System.out.println("Ball manufacturer:"+manufacturer);
		System.out.println("Ball shape:"+shape);
		System.out.println("Ball surfaceFinish:"+surfaceFinish);
		System.out.println("Ball paneljointType:"+paneljointType);
		System.out.println("Ball year:"+year);
		System.out.println("Ball Brand:"+Brand);
		System.out.println("Ball manufacOwner:"+manufacOwner);
		System.out.println("Ball manuIn:"+manuIn);
		System.out.println("Ball materialUsed:"+materialUsed);
		System.out.println("Ball texture:"+texture);
		System.out.println("Ball durability:"+durability);
		System.out.println("Ball exportedTo:"+exportedTo);
		System.out.println("Ball composation:"+composation);
		System.out.println("Ball weight:"+weight);
		System.out.println("Ball BallMadeOf:"+BallMadeOf);
		
	}
	

}
