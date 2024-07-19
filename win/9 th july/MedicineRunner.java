class MedicineRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in MedicineRunner");
		
		double price=Medicine.price("Paracetamol");
		System.out.println("price:"+price);
		
		 price=Medicine.price("Amoxicillin");
		System.out.println("price:"+price);
		
		 price=Medicine.price("Cetirizine");
		System.out.println("price:"+price);
		
		 price=Medicine.price("Aspirin");
		System.out.println("price:"+price);
		
		 price=Medicine.price("Omeprazole");
		System.out.println("price:"+price);
		
		 price=Medicine.price("Paraoxidenl");
		System.out.println("price:"+price);
		
		System.out.println("==========================================================");
		
		
		
		
		String medicineName=Disease.medicineName("Cold and Fever");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Disease.medicineName("irching");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Disease.medicineName("pain");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Disease.medicineName("Cold");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Disease.medicineName("pneumonia");
		System.out.println("medicineName:"+medicineName);
		
		
         
		 System.out.println("==========================================================");		
		
		
		
		 boolean availability=Doctor.availability("Dr.Kiran S G");
		 System.out.println("availability:"+availability);
		 
		 
		  availability=Doctor.availability("Dr. K.N rao");
		 System.out.println("availability:"+availability);
		 
		  availability=Doctor.availability("Dr. Badakar");
		 System.out.println("availability:"+availability);
		 
		  availability=Doctor.availability("Dr.Vrushank");
		 System.out.println("availability:"+availability);
		 
		 
		
	}
}