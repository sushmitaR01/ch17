class MedicineRunner
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in the MedicineRunner");
		if(args.length==4)
		{
			System.out.println("Getting 4 references  from MedicineRunner");
			String name=args[0];
			String manfDate=args[1];
			String price=args[2];
			String quantity=args[3];
			long convertedManfDate=Long.parseLong(manfDate);
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Medicine.information(name,convertedManfDate,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("not enough references ");
		}
		System.out.println("Endingn main in the MedicineRunner");
	}
}