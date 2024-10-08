package com.xworkz.lamdaFunction.functional.usage;

import com.xworkz.lamdaFunction.functional.Starter;

public class Labour {
	
	public void startMotor(Starter starter) {
		
		System.out.println("Running startmotor in labour");
		if(starter!=null) {
			System.out.println("Starter is not null");
			starter.on();
		}
		else {
			System.out.println("Starter is  null");
		}
		System.out.println("Exit Statermoter in labour");
		
	}
	public void OrderFood(FoodApp foodapp) {
		if(foodapp!=null) {
			foodapp.order("Dosa");
		}
	}

}
