package com.xworkz.lamdaFunction.functional.runner;

import com.xworkz.lamdaFunction.functional.Starter;
import com.xworkz.lamdaFunction.functional.usage.FoodApp;
import com.xworkz.lamdaFunction.functional.usage.Labour;

public class LamdaRunner {

	public static void main(String[] args) {
		Starter starter=()->{
			System.out.println("Running on in lamda expression");
			

	};
	Labour labour=new Labour();
	labour.startMotor(starter);
	
	FoodApp FoodApp=(String item)->{
		System.out.println("Food App Item:"+item);
		
	};
	labour.OrderFood(FoodApp);
	}
}

