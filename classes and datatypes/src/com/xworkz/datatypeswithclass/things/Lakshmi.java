package com.xworkz.datatypeswithclass.things;

public class Lakshmi {
	
	
	
	public void dry(WashingMachine washingMachine)
	{
		if(washingMachine!=null)
		{
		washingMachine.rinse();
		washingMachine.show();
		}
		else {
			System.out.println("washingMachine is null");
		}
	}

}
