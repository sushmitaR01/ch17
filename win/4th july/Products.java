class Products
{
	public static void product(String brand,double price )
	{
		System.out.println("Running main in Products");
		Buy.product("Trends",850.0 );
		Buy.product("Levis",550.0 );
	}
	if (price>600 && price<1000)
	{
		System.out.println("Price is valid");
	}
	else
	{
		System.out.println("Price is Invvalid");
	}
	
}