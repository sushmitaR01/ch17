package com.xworkz.demo.impl;

import com.xworkz.demo.media.HotelRule;

public class CanaraHotelRuleImpl implements HotelRule{
	@Override
	public boolean cleanPremises() {
		System.out.println("Running a cleanPremises in a CanaraHotelRuleImpl");
		return false;
	}

}
