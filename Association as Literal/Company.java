class Company
{
	int id;
	String name;
	String location;
	
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("Samanvi",5,"Assistance Developer"40000);
	
	Company()
	{
		System.out.println("Created a Company with no param cons");
	}
	Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println("Company id:"+id);
		System.out.println("Company name:"+name);
		System.out.println("Company location:"+location);
		
		softwareEnginner.display();
	}
	
		
	
}