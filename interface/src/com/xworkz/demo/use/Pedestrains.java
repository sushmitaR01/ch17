package com.xworkz.demo.use;

import com.xworkz.demo.media.TrafficRule;

public class Pedestrains {

	private TrafficRule trafficRule;

	public Pedestrains(TrafficRule trafficRule) {
		super();
		this.trafficRule = trafficRule;
	}

	public void safety(String regd) {
		System.out.println("Running a safety in a Pedestrains");
		if (trafficRule != null) {
			String same = trafficRule.licenceNo(regd);
			System.out.println("registration no:"+same);
			if (same != null) {
				System.out.println("signal is on");
			} else {
				System.out.println("Signal is off");
			}
		} else {
			System.out.println("Traffic rule is null");
		}

	}

}
