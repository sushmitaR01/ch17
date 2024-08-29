package com.xworkz.datatypeswithclass.runner;

import com.xworkz.datatypeswithclass.things.PoliceGun;
import com.xworkz.datatypeswithclass.things.SoldierGun;
import com.xworkz.datatypeswithclass.things.Gun;
import com.xworkz.datatypeswithclass.things.DbossGun;
import com.xworkz.datatypeswithclass.things.GodseGun;


public class GunRunner {

	public static void main(String[] args) {
		
		SoldierGun soldierGun=new SoldierGun();
		soldierGun.indiansoldier();
		
		
		Gun gun1=new Gun("Colt M1911","India","sniper rifles");
		PoliceGun policeGun=new PoliceGun();
		policeGun.arrest(gun1);
		
		DbossGun dbossGun=new DbossGun(gun1);
		
		dbossGun.jail();
		
		GodseGun godse=new GodseGun();
		godse.use();
		
		

	}

}
