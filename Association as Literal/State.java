class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Banglore",15000);
	
	
	State()
	{
		System.out.println("Created a State with no parm args.............");
	}
	State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}
	public void display()
	{
		System.out.println("State name:"+name);
		System.out.println("State language:"+language);
		
		capitalCity.display();
	}
		
	
	
}