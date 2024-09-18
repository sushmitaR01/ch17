package com.xworkz.demo.runner;

import com.xworkz.demo.impl.CanaraHotelRuleImpl;
import com.xworkz.demo.impl.KushiPg;
import com.xworkz.demo.impl.LuluMall;
import com.xworkz.demo.impl.RoadRules;
import com.xworkz.demo.media.HotelRule;
import com.xworkz.demo.media.MallRule;
import com.xworkz.demo.media.PGRule;
import com.xworkz.demo.media.TrafficRule;
import com.xworkz.demo.use.FoodSafetyDepartment;
import com.xworkz.demo.use.Pedestrains;
import com.xworkz.demo.use.RaviPg;
import com.xworkz.demo.use.ShoppersinMall;

public class HotelRunner {

	public static void main(String[] args) {
		HotelRule hotelRule = new CanaraHotelRuleImpl();

		FoodSafetyDepartment foodSafetyDepartment = new FoodSafetyDepartment();
		foodSafetyDepartment.setHotelRule(hotelRule);
		foodSafetyDepartment.inspection();
		System.out.println("=================");

		TrafficRule TrafficRule = new RoadRules();
		Pedestrains pedestrains = new Pedestrains(TrafficRule);
		pedestrains.safety("NMLS ID 12345");

		System.out.println("=================");

		MallRule mallRule = new LuluMall();

		ShoppersinMall shoppersinMall = new ShoppersinMall(mallRule);
		shoppersinMall.buyCloths();
		System.out.println("=================");

		PGRule pGRule = new KushiPg();

		RaviPg raviPg = new RaviPg(pGRule);
		raviPg.available();

	}

}
