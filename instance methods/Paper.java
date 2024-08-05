class Paper
{
	double thickness=0.5;
	char size;
	int quality;
	String color;
	
	public void display()
	{
		System.out.println("Paper thickness:"+thickness);
		System.out.println("Paper size:"+size);
		System.out.println("Paper quality:"+quality);
		System.out.println("Paper color:"+color);
	}
	
	
	
	public Paper(char size)
	{
		this.size=size;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	
	
	
}