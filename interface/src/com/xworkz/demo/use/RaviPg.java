package com.xworkz.demo.use;

import com.xworkz.demo.media.PGRule;

public class RaviPg {

	PGRule pGRule;

	public RaviPg(PGRule pGRule) {
		super();
		this.pGRule = pGRule;
	}

	public void available() {
		System.out.println("Running a available in a RaviPg");
		if (pGRule != null) {
			double high = pGRule.costPerMonth();
			boolean correct = pGRule.wifi();
			if (correct) {
				System.out.println("wifi is onn");

			} else {
				System.out.println("wifi is off");
			}
		} else {
			System.out.println("pGRule is not null");
		}
	}

}
