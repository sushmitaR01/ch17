package com.xworkz.datatypeswithclass.things;

public class Buddy {
	Dog dog;
	public Buddy(Dog dog)
	{
		this.dog=dog;
	}
	public void bite()
	{
		if(dog!=null) {
	    	 dog.barking();
	    	 dog.fetching();
	    	 }
	    	 else {
	    		 System.out.println("dog is null");
	    	 }
		
	     }
	}


