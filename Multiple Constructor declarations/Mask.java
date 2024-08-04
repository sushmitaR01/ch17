class Mask
{
	double cost;
	char size;
	String material;
	
	Mask()
	{
		System.out.println("No parameter const");
	}
	
	Mask(double cost)
	{
		System.out.println("double parameter const");
	this.cost=cost;
	}
	Mask(char size)
	{
		System.out.println("char parameter const");
		this.size=size;
	}
	Mask(String material)
	{
		System.out.println("String parameter const");
		this.material=material;
	}
	Mask(double cost,char size,String material)
	{
		System.out.println("double & char & String parameter const");
		this.cost=cost;
		this.size=size;
		this.material=material;
	}
	Mask(double cost,char size)
	{
		System.out.println("double  &  char parameter const");
		this.cost=cost;
		this.size=size;
		
		
		System.out.println("Created a Mask using double,char,String");
		
	}
	
		
		
	
}