package com.xworkz.demo.impl;

import com.xworkz.demo.media.PGRule;

public class KushiPg implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("Running a costPerMonth in a KushiPg");
		return 5000;
	}

	@Override
	public boolean wifi() {
		System.out.println("Running a wifi in a KushiPg");
		return true;
	}

}
