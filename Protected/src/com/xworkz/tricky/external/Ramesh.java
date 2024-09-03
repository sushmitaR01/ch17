package com.xworkz.tricky.external;

import com.xworkz.tricky.internal.Gun;
import com.xworkz.tricky.internal.Weapon;

public class Ramesh {
	Weapon weapon=new Weapon();
	
	Gun gun=new Gun();
	
	public void hit()
	{
		weapon.use();
		weapon.fire();
		
	}
	
	public void shoots()
	{
		gun.use();
		gun.fire();
		gun.blast();
		
	}
	

}
