class IndianRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in IndianRunner");
		
		double code=Indian.code("India");
		System.out.println("code:"+code);
		
		
		code=Indian.code("Nepal");
		System.out.println("code:"+code);
		
		code=Indian.code("South Africa");
		System.out.println("code:"+code);
		
		code=Indian.code("Spainl");
		System.out.println("code:"+code);
		
		code=Indian.code("Sri Lanka");
		System.out.println("code:"+code);
		
		code=Indian.code("Thailand");
		System.out.println("code:"+code);
		
		
		System.out.println("=================================");
		
		
		
		double price=Grocery.price("Surf Excel");
		System.out.println("price:"+price);
		
		price=Grocery.price("Bourn Vita");
		System.out.println("price:"+price);
		
		price=Grocery.price("Colgate");
		System.out.println("price:"+price);
		
		price=Grocery.price("Rice");
		System.out.println("price:"+price);
		
		price=Grocery.price(" Pasta & Noodles");
		System.out.println("price:"+price);
		
		price=Grocery.price("Flour");
		System.out.println("price:"+price);
		
		
		
		System.out.println("=================================");
		
		
		String movieName=Films.movieName("KGF");
		System.out.println("movieName:"+movieName);
		
		
		movieName=Films.movieName("Kirik Party");
		System.out.println("movieName:"+movieName);
		
		
		movieName=Films.movieName("Ugramm");
		System.out.println("movieName:"+movieName);
		
		movieName=Films.movieName("RangiTaranga");
		System.out.println("movieName:"+movieName);
		
		movieName=Films.movieName("Tagaru");
		System.out.println("movieName:"+movieName);
		
		movieName=Films.movieName("KGF");
		System.out.println("movieName:"+movieName);
		
		
		
	}
}