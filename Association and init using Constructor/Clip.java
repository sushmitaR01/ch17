class Clip
{
	String color;
	String type;
	
	public Clip(String color,String type)
	{
		this.color=color;
		this.type=type;
		System.out.println("Created a  Clip eith two String parm cons...................");
	}
	public void details()
	{
		System.out.println("Clip color:"+color);
		System.out.println("Clip type:"+type);
	}
	
		
	
}