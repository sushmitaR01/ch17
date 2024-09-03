package com.xworkz.tricky.internal;
import com.xworkz.tricky.internal.Gun;
import com.xworkz.tricky.internal.Weapon;



	public class Raju {
		
		Weapon weapon=new Weapon();
		Gun gun =new Gun();
		
		public void weapoon()
		{
			System.out.println("Running a Weapoon in a raju");
			weapon.use();
			weapon.fire();
			
			
		}
		
		public void shoot()
		{
			System.out.println("Running a shoot in a raju");
			gun.use();
			gun.fire();
			gun.blast();
		}
		
		
		

	}


