class Medicine
{
	
	public static double price(String medicineName)
	{
		System.out.println("Running medicineName in Medicine");
		System.out.println("medicineName arg:" +medicineName);
		
		if (medicineName=="Paracetamol")
		{
			return 20;
		}
		
		
		if (medicineName=="Amoxicillin (")
		{
			return 100;
		}
		
		
		if (medicineName=="Cetirizine")
		{
			return 30;
		}
		
		
		if (medicineName=="Aspirin")
		{
			return 70;
		}
		
		if (medicineName=="Omeprazole")
		{
			return 144;
		}
		
		System.out.println("Not Found");
		return 0;
	}
}