package com.xworkz.standards.internal;

import com.xworkz.standards.Laptop;

public class Runner {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.isPrint();
		System.out.println("laptop ruuning in Runner");
		
		
		Staff staff=new Staff();
		staff.takePrintOut();
		System.out.println("staff running runner");
		
		staff.getlaptop();
		System.out.println("getlaptop running runner");
		
		
		 
	}

}
