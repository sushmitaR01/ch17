class Projector
{
	String company;
	String type;
	String color;
	double weight=1.5;
	
	public void display()
	{
		System.out.println("Projector company:"+company);
		System.out.println("Projector type:"+type);
		System.out.println("Projector color:"+color);
		System.out.println("Projector weight:"+weight);
	}
	
	
	
	public Projector(String company)
	{
		this.company=company;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
	
	
}