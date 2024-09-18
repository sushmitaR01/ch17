package com.xworkz.demo.impl;

import com.xworkz.demo.media.TrafficRule;

public class RoadRules implements TrafficRule {
	@Override
	public String licenceNo(String regd) {
		System.out.println("Running a TrafficRule in a RoadRules");
		return regd;
	}

}
