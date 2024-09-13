package com.xworkz.chaining.examples;

public abstract class Provider {
	
	private String name;
	private String CEOname;
	public Provider(String name, String CEOname) {
		super();
		this.name = name;
		this.CEOname = CEOname;
	}
	@Override
	public String toString() {
		return "Provider [name=" + name + ", CEOname=" + CEOname + "]";
	}
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof Provider)
			{
				Provider casted =(Provider)obj;
				if(this.name.equals(casted.name)&&this.CEOname.equals(casted.CEOname))
				{
					
					return true;
					
				}
			}
			else {
				System.out.println("obj is not type");
			}
			
		}
		else {
			System.out.println("Object is null cannot compare");
		}
		return false;
	}
	
	public  abstract void service();
	
}
