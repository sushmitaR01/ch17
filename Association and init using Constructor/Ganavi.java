class Ganavi
{
	String email;
	Clip clip;
	
	public Ganavi(String email,Clip clip)
	{
		System.out.println("Created a Ganavi using two parm String and Clip Cons................");
		this.email=email;
		this.clip=clip;
	}
	
	public void details()
	{
		System.out.println("Ganavi email:"+email);
		clip.details();
	}
	
	
}
