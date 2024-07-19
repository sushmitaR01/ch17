class BuyRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("samsung",60);
		Buy.product("samsung",150);
		Buy.product("mango",100,"high",250);
		Buy.product("mango",300,"high",350);
		Buy.bookMovieTicket("kalki","navarang",150,200);
		Buy.bookMovieTicket("kotti","laxmi",250,150);
		Buy.buyEgg(4,10);
		Buy.buyEgg(5,25);
		Buy.buyShampoo(100,250,"nyle","fourOfJuly");
		Buy.buyShampoo(250,250,"nyle","fourOfJuly");
		Buy.buyLaptop("HP",23564,50000,4400,15,"windows ten",500,4);
		Buy.buyLaptop("HP",23564,50000,4400,18,"windows ten",500,4);
		Buy.buyCake('S',"square","red valvet",250,10);
		Buy.buySmartWatch("FireBolt",5000,255,'R',8);
		Buy.buySmartWatch("FireBolt",5000,255,'R',15);
		
	
	}
}