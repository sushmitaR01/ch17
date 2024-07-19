class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("running deliver in DeliveryVehicle");                                 
		Company.deliver("item","location");
		System.out.println("Item:"+item);      
		System.out.println("Location:"+location);  
	}
}

		
		