class CapitalCity
{
	String name;
	double population;
	
	CapitalCity()
	{
		System.out.println("created a CapitalCity with no parm cons");
	}
	CapitalCity(String name,double population)
	{
		this.name=name;
		this.population=population;
	}
	public void display()
	{
		System.out.println("CapitalCity name:"+name);
		System.out.println("CapitalCity population:"+population);
	}
	
	
}
