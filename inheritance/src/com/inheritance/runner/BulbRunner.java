package com.inheritance.runner;
import com.inheritance.things.*;


public class BulbRunner {

	public static void main(String[] args) {
		
		Bulb bulb1=new Tubelight();
		
		bulb1.volts=60;
		bulb1.glow();
		System.out.println("========================================");
		
		Halwa halwa1=new Sweet();
		halwa1.typeOfDense="thick";
		halwa1.price=200;
		halwa1.quantity=2;
		halwa1.carrothalwa();
		
		Halwa halwa2=new Sweet();
		halwa2.typeOfDense="Fluid";
		halwa2.price=300;
		halwa2.quantity=4;
		halwa2.carrothalwa();
		System.out.println("========================================");
		
		SmartPhone smartPhone1=new Samsung();
		smartPhone1.versions="samsung galaxy s21";
		smartPhone1.price=25000;
		smartPhone1.color="Blue";
		smartPhone1.Processor=650;
		smartPhone1.bestsamrtphone();
		System.out.println("========================================");
		
		Bull bull1=new Animal();
		bull1.type="Black bull";
		bull1.price=50000;
		bull1.gender="Male";
		bull1.noOfBulls=50;
		bull1.use="Racing";
		bull1.fighting();
		System.out.println("========================================");
		
		Chicken chicken1=new Bird();
		chicken1.type="Silkie";
		chicken1.price=500;
		chicken1.gender="female";
		chicken1.quantity=3;
		chicken1.use="health-promoting nutrients";
		chicken1.breed="param";
		chicken1.lifespan=200;
		chicken1.rank="Species";
		chicken1.quality="Superiour";
		chicken1.color="Red";
		chicken1.Nonveg();
		System.out.println("========================================");
		
		

	}

}
