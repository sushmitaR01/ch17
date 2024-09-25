package com.xworkz.rules.repo;

import com.xworkz.rules.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		WashingMachine washingMachine=new IFBWashingMachine();
		washingMachine.dry();
		washingMachine.wash();

	}

}
