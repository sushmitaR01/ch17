class ClipRunner
{
	public static void main(String[] args)
	{
		Clip clip=new Clip("Black","Banana Clip");
		Ganavi ganavi=new Ganavi("ganavi123@gmail.com",clip);
		ganavi.details();
		System.out.println("===========================================");
		
		Clip clip1=new Clip("Blue","Metal Clip");
		Ganavi ganavi1=new Ganavi("krupali123@gmail.com",clip1);
		ganavi1.details();
		
		
		
		
	}
	
		
		
}