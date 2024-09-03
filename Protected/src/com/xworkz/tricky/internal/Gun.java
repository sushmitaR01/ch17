package com.xworkz.tricky.internal;
import com.xworkz.tricky.internal.Weapon;

public class Gun extends Weapon{
	
	@Override
	
	
	public void use()
	{
		System.out.println("Running Use in a Gun");
	}
	@Override
	public void fire()
	{
		System.out.println("Running fire in a Gun");
		
	}
	public void blast()
	{
		System.out.println("Running a blast in a Gun");
		use();
		fire();
	}
	
}
