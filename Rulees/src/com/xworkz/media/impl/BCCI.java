package com.xworkz.media.impl;

import com.xworkz.media.CricketRule;

public class BCCI {
	
	private CricketRule cricketrule;

	public void setCricketrule(CricketRule cricketrule) {
		this.cricketrule = cricketrule;
	}
	
	public void check() {
		System.out.println("Running a check in a BCCI");
		if(cricketrule!=null) {
			System.out.println("cricket rule is not null");
			cricketrule.powerPlay();
		
			
		}
		else {
			System.out.println("cricket rule is  null");
		}
	}

}
