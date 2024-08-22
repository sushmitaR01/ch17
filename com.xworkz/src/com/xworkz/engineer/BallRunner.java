package com.xworkz.engineer;

public class BallRunner {

	public static void main(String[] args) {
		Ball ball1=new Ball("Rubber", 20, 25, 19, 10, "hisco", "circle", "hard");
		ball1.setpaneljointType("grooved");
		ball1.setyear(2019);
		ball1.setBrand("woody");
		ball1.setmanufacOwner("zindal");
		ball1.setmanuIn("ballary");
		ball1.setmaterialUsed("premium");
		ball1.settexture("hard");
		ball1.setdurability("long");
		ball1.setexportedTo("dubai");
		ball1.setcomposation("texture");
		ball1.setweight("lightweigth");
		ball1.setBallMadeOf("heavy quality");
		
		
		
		
		Ball ball2=new Ball("nike", 24, 29, 29, 20, "adidas", "circle", "soft");
		ball2.setpaneljointType("bonded");
		ball2.setyear(2020);
		ball2.setBrand("woody");
		ball2.setmanufacOwner("adidas");
		ball2.setmanuIn("mumbai");
		ball2.setmaterialUsed("superior");
		ball2.settexture("soft");
		ball2.setdurability("short");
		ball2.setexportedTo("banglore");
		ball2.setcomposation("texture");
		ball2.setweight("heavyweigth");
		ball2.setBallMadeOf("heavy quality");
		
		
		
		Ball ball3=new Ball("adidas teamgeist", 34, 49, 29, 10, "umbro", "circle", "hard");
		ball3.setpaneljointType("stitched");
		ball3.setyear(2010);
		ball3.setBrand("nike");
		ball3.setmanufacOwner("adidas");
		ball3.setmanuIn("kolkata");
		ball3.setmaterialUsed("superior");
		ball3.settexture("hard");
		ball3.setdurability("short");
		ball3.setexportedTo("gujarat");
		ball3.setcomposation("texture");
		ball3.setweight("heavyweigth");
		ball3.setBallMadeOf("heavy quality");
		
		
		
		Ball[] ref=new Ball[3];
		ref[0]=ball1;
		ref[1]=ball2;
		ref[2]=ball3;
		
		
		for(Ball ballTemp:ref)
		{
			System.out.println(ballTemp);
			ballTemp.display();
		}
		
		
		

	}

}
