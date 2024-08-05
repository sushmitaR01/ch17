class Rocket
{
	String country;
	int speed;
	String fuelCapacity="18 L ";
	String noOfThrusters;
	
	public void display()
	{
		System.out.println("Country name:"+country);
		System.out.println("Rocket speed:"+speed);
		System.out.println("Rocket fuelCapacity:"+fuelCapacity);
		System.out.println("Rocket noOfThrusters:"+noOfThrusters);
	}
	
	public Rocket(String country)
	{
		this.country=country;
	}
	public void setNoOfThrusters(String noOfThrusters)
	{
		this.noOfThrusters=noOfThrusters;
	}
	
	
	
	
	
	
	
	
}