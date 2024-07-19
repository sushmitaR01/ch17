class Indian
{
	public static double code(String country)
	{
		System.out.println("Running code in Indian");
		System.out.println("country arg:" +country);
		
		if (country=="India")
		{
			return 356;
		}
		
		
		if (country=="Nepal")
		{
			return 524;
		}
		
		
		if (country=="South Africa")
		{
			return 710;
		}
		
		
		if (country=="South Africa")
		{
			return 710;
		}
		
		if (country=="Sri Lanka")
		{
			return 144;
		}
		
		System.out.println("Not Found");
		return 0;
	}
}