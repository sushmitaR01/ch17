class BuyRunnerr
{
	public static void main(String[] args)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("samsung",60);
		Buy.product("samsung",150);
		Buy.product("mango",100,"high",250);
		Buy.product("mango",300,"high",350);
		Buy.bookMovieTicket("Kalki","Navarang theater",6,250);
		Buy.bookMovieTicket("KGF","Cinepolic theater",8,450);
        Buy.buyEgg(12,10.0);
        Buy.buyEgg(15,18.0);
        Buy.buyShampoo(250,400.0,"Loreal","06 01 022");
        Buy.buyShampoo(350,800.0,"Sunsilk","08 09 20020");
		Buy.buyCake('S',"Honey Cake","Vanilla",500.0,1);
        Buy.buyCake('L',"Pastry","Choclate",800.0,5);
        Buy.buyLaptop("Lenova",87642,58.000,100,3.4,"Windows 7",8,4);
		Buy.buyLaptop("Dell",834642,45.000,200,4.4,"Windows 11",10,8);
		Buy.buySmartWatch("Noise",1800.0,1,'L',5);
		Buy.buySmartWatch("one plus",2000.0,3,'L',9);

		
	}
}