class JuiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in the JuiceRunner");
		if(args.length==5)
		{
			System.out.println("Getting 4 references  from MedicineRunner");
			String name=args[0];
			String brand=args[1];
			String flavour=args[2];
			String price=args[3];
			String quantity=args[4];
			
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Juice.information(name,brand,flavour,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("not enough references ");
		}
		System.out.println("Endingn main in the MedicineRunner");
	}
}