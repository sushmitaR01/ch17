package com.xworkz.datatypeswithclass.things;

public class DbossGun {
	
	private Gun gun;
	
	public DbossGun(Gun gun)
	{
		this.gun=gun;
	}
	public void jail()
	{
		if(gun!=null) {
		gun.fire();
		gun.display();
		}
		else {
			System.out.println("Gun is null");
		}
	}

}
