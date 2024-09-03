package com.xworkz.tricky.external;

import com.xworkz.tricky.internal.Weapon;

public class MachineGun extends Weapon{
	@Override
	
	protected void use()
	{
		System.out.println("Running  Use in a MachineGun");
	}
	@Override
	
	public void fire()
	{
		System.out.println("Running fire in a MachineGun");
		
	}
	
	public void cut()
	{
		System.out.println("Running a cut in a MachineGun ");
		use();
		fire();
	}

	
}
