class Buyy
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
	System.out.println("running bookMovieTicket in Buy");   
	System.out.println("Name:"+name);   
	System.out.println("TheaterName:"+theaterName); 
	System.out.println("Quantity:"+quantity); 
	System.out.println("Price:"+price); 
	
	if (quantity>0 && quantity<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}

}

public static void buyEgg(int total,double pricePerEgg)
{
	System.out.println("running buyEgg in Buy"); 
	System.out.println("Total:"+total);   
	System.out.println("PricePerEgg:"+pricePerEgg);   
    if (total>0 && total<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
	
	
	}
	
	
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
{
	System.out.println("running buyShampoo in Buy"); 
		System.out.println("quantityInMl:"+quantityInMl);   
    	System.out.println("Price:"+price);   
	System.out.println("Brand:"+brand);   
	System.out.println("ManfDate:"+manfDate);   

	if (quantityInMl>0 && quantityInMl<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
	
	
	
	
	
	
}


public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
	System.out.println("running buyCake in Buy"); 
	System.out.println("size:"+size);   
    System.out.println("Type:"+type);   
	System.out.println("flavour:"+flavour);   
	System.out.println("cost:"+cost);  
	System.out.println("quantity:"+quantity); 

	if (quantity>0 && quantity<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
	
	}
	
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
{
		System.out.println("running buyLaptop in Buy"); 
		System.out.println("Brand:"+brand);   
		System.out.println("serialNo:"+serialNo); 
		System.out.println("price:"+price);   
		System.out.println("batteryCapacity:"+batteryCapacity);   
		System.out.println("screenSize:"+screenSize);   
		System.out.println("os:"+os);   
		System.out.println("harddiskSize:"+harddiskSize);   
		System.out.println("ramSize:"+ramSize);   

		
		if (batteryCapacity>0 && batteryCapacity<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
		
		
		
	}
	
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
			System.out.println("running buySmartWatch in Buy"); 
			System.out.println("Brand:"+brand);   
			System.out.println("Price:"+price); 
		    System.out.println("color:"+color); 
		System.out.println("type:"+type); 
		System.out.println("mode:"+mode); 

		if (mode>0 && mode<200)
		{
			System.out.println("quality is valid");
		}
		else
		{
			System.out.println("quality is in-valid");
		}
		
		
		
		
		
		}
	
	
}