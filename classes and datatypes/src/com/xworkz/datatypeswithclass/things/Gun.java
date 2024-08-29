package com.xworkz.datatypeswithclass.things;

public class Gun {
	
	private String name;
	private String countryMade;
	private String type;
	
    public Gun()
    {
    	System.out.println("Created a with no arg cons...");
    }

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}
    public void  fire()
    {
    	System.out.println("Running in a Gun");
    }
    public void display()
    {
    	System.out.println("Gun Name:"+name);
    	System.out.println("Gun countryMade:"+countryMade);
    	System.out.println("Gun type:"+type);
    	
    }

	
}
