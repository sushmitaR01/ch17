package com.xworkz.rules.examples.impl;

import com.xworkz.rules.examples.HospitalRule;

public class FortisHospital implements HospitalRule {

	public FortisHospital() {

		super();
		System.out.println("running no-args const in FortisHospital");
	}

	public boolean maintainSilence() {
		System.out.println("running maintainSilence");
		return true;
	}

	public int visitorAllowed() {
		System.out.println("running visitorAllowed");
		return 2;

	}

	public int noOfDoctors() {
		System.out.println("running noOfDoctors");
		return 0;
	}

}