package com.xworkz.demo.use;

import com.xworkz.demo.media.HotelRule;

public class FoodSafetyDepartment {
	
	private HotelRule hotelRule;

	public void setHotelRule(HotelRule hotelRule) {
		this.hotelRule = hotelRule;
	}
	
	public void inspection() {
		System.out.println("Running a inspection in a FoodSafetyDepartment");
		if(hotelRule!=null)
		{
			System.out.println("hotelRule is not null");
			hotelRule.cleanPremises();
		}
		else {
			System.out.println("hotelRule is  null");
		}
	}
	
	

}
