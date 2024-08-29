package com.xworkz.datatypeswithclass.things;

public class Abhishek {
	
	private WashingMachine washingMachine;
	public Abhishek(WashingMachine washingMachine)
	{
		this.washingMachine=washingMachine;
	}
        public void best()
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

