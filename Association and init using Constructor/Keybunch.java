class Keybunch
{
	String material;
	Key key;
	
	public Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("Created a Keybunch using two parm cons........................");
	}
	public void details()
	{
		System.out.println("Keybunch material:"+material);
		key.details();
	}
	
}