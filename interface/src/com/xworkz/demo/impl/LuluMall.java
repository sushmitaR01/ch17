package com.xworkz.demo.impl;

import com.xworkz.demo.media.MallRule;

public class LuluMall implements MallRule{

	@Override
	public boolean validId()
	{
		System.out.println("Running a validId in a LuluMall ");
		return true;
	}
}
