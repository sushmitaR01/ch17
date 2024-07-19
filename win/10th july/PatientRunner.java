class PatientRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in MedicineRunner");



 boolean availability=Patient.availability("Dr.Kiran S G");
		 System.out.println("availability:"+availability);
		 
		 
		  availability=Patient.availability("Dr. K.N rao");
		 System.out.println("availability:"+availability);
		 
		  availability=Patient.availability("Dr. Badakar");
		 System.out.println("availability:"+availability);
		 
	}
}