class Grocery
{
	public static double price(String item)
	{
		System.out.println("Running price in Grocery");
		System.out.println("item arg:" +item);
		
		if (item=="Surf Excel")
		{
			return 110;
		}
		
		
		if (item=="Bourn Vita")
		{
			return 344;
		}
		
		
		if (item=="Colgate")
		{
			return 206;
		}
		
		
		if (item=="Rice")
		{
			return 72;
		}
		
		if (item==" Pasta & Noodles")
		{
			return 150;
		}
		
		System.out.println("Not Found");
		return 0;
	}
}