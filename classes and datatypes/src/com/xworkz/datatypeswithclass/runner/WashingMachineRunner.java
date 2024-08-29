package com.xworkz.datatypeswithclass.runner;

import com.xworkz.datatypeswithclass.things.Abhishek;
import com.xworkz.datatypeswithclass.things.Bhukima;
import com.xworkz.datatypeswithclass.things.Lakshmi;
import com.xworkz.datatypeswithclass.things.Megha;
import com.xworkz.datatypeswithclass.things.Nayana;
import com.xworkz.datatypeswithclass.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha=new Megha();
		megha.wash();
		WashingMachine washingMachine=new WashingMachine("IFB","Top Load",35);
		System.out.println("==============================");
		
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.dry(washingMachine);
		System.out.println("==============================");
		
		Abhishek abhishek=new Abhishek(washingMachine);
		abhishek.best();
		System.out.println("==============================");
		
		Bhukima bhukima=new Bhukima();
		bhukima.deepclean();
		System.out.println("==============================");
		
		
		Nayana nayana=new Nayana();
		nayana.models();
		
		

	}

}
