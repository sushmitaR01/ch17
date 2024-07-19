class Disease
{
	public static String medicineName(String symptom)
	{
		System.out.println("Running medicineName in Disease");
		System.out.println("symptom arg:" +symptom);
		
		if (symptom=="Cold and Fever")
		{
			return "Paracetamol";
		}
		
		if (symptom=="irching")
		{
			return "Citrizen";
		}
		
		if (symptom=="pain")
		{
			return "Pain killer";
		}
		
		if (symptom=="Cold")
		{
			return "Amoxollin";
		}
		System.out.println("Not Found");
		return "Not Found";
	}
}