package com.xworkz.rules.repo;

import com.xworkz.rules.WashingMachine;

public class IFBWashingMachine implements WashingMachine{

	@Override
	public void wash() {
		System.out.println("Running in a  IFBWashingMachine");
		
	}

	@Override
	public void dry() {
		System.out.println("Running in a  IFBWashingMachine");
		
	}
	

}
