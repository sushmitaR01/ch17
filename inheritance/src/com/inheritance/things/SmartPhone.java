package com.inheritance.things;

public class SmartPhone {
	
   public String versions;
   public double price;
   public String color;
   public int Processor;
   
   public SmartPhone()
   {
	   System.out.println("Created a SmartPhone using a no args cons....");
   }
   public SmartPhone(String versions, double price,String color, int Processor)
   {
	   System.out.println("Created a SmartPhone using a with an  args cons....");
	   this.versions=versions;
	   this.price=price;
	   this.color=color;
	   this.Processor=Processor;
   }
   public void bestsamrtphone()
   {
	   System.out.println("Running smart phone");
	   System.out.println("Smart phone versions :"+versions);
	   System.out.println("Smart phone price :"+price);
	   System.out.println("Smart phone color :"+color);
	   System.out.println("Smart phone Processor :"+Processor);
	   
   }

}
