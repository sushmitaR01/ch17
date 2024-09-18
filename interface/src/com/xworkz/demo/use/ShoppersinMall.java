package com.xworkz.demo.use;

import com.xworkz.demo.media.MallRule;

public class ShoppersinMall {
	
	
	MallRule mallRule;

	public ShoppersinMall(MallRule mallRule) {
		super();
		this.mallRule = mallRule;
	}
	public void buyCloths() {
		System.out.println("Running a buyCloths in a ShoppersinMall");
		if(mallRule!=null) {
			boolean correct=mallRule.validId();
			if(correct) {
				System.out.println("id is valid");
			}
			else {
				System.out.println("id is not valid");
			}
		}
		else {
			System.out.println("id is null");
		}
		
	}

}
