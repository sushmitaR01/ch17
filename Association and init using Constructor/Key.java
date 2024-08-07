class Key
{
	double weight;
	String brand;
	
	
	public Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
		System.out.println("Create a Key using two parm double and brand");
		
	}
	
	public void details()
	{
		System.out.println("Key weight:"+weight);
		System.out.println("Key brand:"+brand);
	}
	
		
}