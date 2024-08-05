class Chocolate
{
	String brand;
	double price;
	String flavour;
	String size="Medium";
	
	public void display()
	{
		System.out.println("Chocolate name:"+brand);
		System.out.println("Chocolate price:"+price);
		System.out.println("Chocolate flavour:"+flavour);
		System.out.println("Chocolate size:"+size);
	}
	
	
	
	public Chocolate(double price)
	{
		this.price=price;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	
	
}