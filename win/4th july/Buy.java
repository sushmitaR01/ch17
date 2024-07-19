class Buy
{
	public static void product(String brand,double price)
	{
		System.out.println("running product in buy with String & double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		
		if (price>0 && price<100)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is in-valid");
		}
	}
	
	
	public static void product(String name,int quality,String quantity,double price)
	{
		System.out.println("running product in buy with two string ,one int & one double parameter");
		System.out.println("Name:"+name);
		System.out.println("Quality:"+quality);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price;"+price);
		
		if (quality>0 && quality<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
	}
	
	
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("running bookMovieTicket in buy parameters");
		System.out.println("Name:"+name);
		System.out.println("TheaterName:"+theaterName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		
		if (quantity>0 && quantity<200)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is in-valid");
		}
		
	}
	
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("running buyEgg in buy parameters");
		System.out.println("Total:"+total);
		System.out.println("PricePerEgg:"+pricePerEgg);
		
		if (pricePerEgg>0 && pricePerEgg<20)
		{
			System.out.println("pricePerEgg is valid");
		}
		else
		{
			System.out.println("pricePerEgg is in-valid");
		}
		
	}
	
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("running buyShampoo in buy parameters");
		System.out.println("QuantityInMl:"+quantityInMl);
		System.out.println("Price:"+price);
		System.out.println("Brand:"+brand);
		System.out.println("ManfDate:"+manfDate);
		
		
		if (quantityInMl>0 && quantityInMl<=200)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is in-valid");
		}
		
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("running buyLaptop in buy parameters");
		System.out.println("Brand:"+brand);
		System.out.println("SerialNo:"+serialNo);
		System.out.println("Price:"+price);
		System.out.println("BatteryCapacity:"+batteryCapacity);
		System.out.println("ScreenSize:"+screenSize);
		System.out.println("Os:"+os);
		System.out.println("HardDiskSize:"+harddiskSize);
		System.out.println("RamSize:"+ramSize);
		
		
		
		if (screenSize>0 && screenSize<17)
		{
			System.out.println("screenSize is valid");
		}
		else
		{
			System.out.println("screenSize is in-valid");
		}
		
	}
	
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("running buyCake in buy parameters");
		System.out.println("Size:"+size);
		System.out.println("Type:"+type);
		System.out.println("Flavour:"+flavour);
		System.out.println("Cost:"+cost);
		System.out.println("Quantity:"+quantity);
		
		if (quantity>0 && quantity<5)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is in-valid");
		}
		
	}
	
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("running buySmartWatch in buy parameters");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Color:"+color);
		System.out.println("Type:"+type);
		System.out.println("Mode:"+mode);
		
		if (mode>0 && mode<10)
		{
			System.out.println("mode is valid");
		}
		else
		{
			System.out.println("mode is in-valid");
		}
		
	}
	
}