class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene()
	{
		System.out.println("No parameter const");
	}
	Kerosene(double price,int quantity,boolean quality)
	{
		
		System.out.println("double & quantity& quality parameter const");
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	Kerosene(boolean quality)
	{
		System.out.println("quality parameter const");
		this.quality=quality;
	}
	Kerosene(double price)
	{
		System.out.println("double parameter const");
		this.price=price;
	}
	
}