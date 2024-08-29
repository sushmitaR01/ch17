package com.xworkz.datatypeswithclass.things;

public class PoliceGun {
	
	public void arrest(Gun gun)
	{
		if(gun!=null) {
		gun.display();
		gun.fire();
		}
		else {
			System.out.println("Gun is null");
		}
	}

}
