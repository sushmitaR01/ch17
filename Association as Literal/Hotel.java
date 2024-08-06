class Hotel
{
	String name="Sagar";
	Owner owner=new Owner("Kiran",28,'M');
	
	Hotel()
	{
		System.out.println("Created a Hotel with no para cons...............");
	}
	
	public void display()
	{
	owner.display();
	}
	
}