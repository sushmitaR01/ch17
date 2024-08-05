class Speaker
{
	String brand;
	int size;
	double cost;
	String output=" post-amplification";
	
	public void display()
	{
		System.out.println("Brand name:"+brand);
		System.out.println("Speaker size:"+size);
		System.out.println("Speaker cost:"+cost);
		System.out.println("Speaker output:"+output);
	}
	
	
	
	public Speaker(int size)
	{
		this.size=size;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	
	
}