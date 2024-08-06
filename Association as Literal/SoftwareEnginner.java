class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner()
	{
		System.out.println("Created a SoftwareEnginner with no parm cons")
	}
	
	
	SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("SoftwareEnginner name:"+name);
		System.out.println("SoftwareEnginner experience:"+name);
		System.out.println("SoftwareEnginner designation:"+designation);
		System.out.println("SoftwareEnginner salary:"+salary);
	}
	
		
}