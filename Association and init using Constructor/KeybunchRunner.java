class KeybunchRunner

{

public static void main(String[] args)
{
	Key key=new Key(2,"union");
	Keybunch keybunch=new Keybunch("silica",key);
	keybunch.details();
	System.out.println("=================================================");
	
	
	Key key1=new Key(7,"Stainless Steel");
	Keybunch keybunch1=new Keybunch("Metal",key1);
	keybunch1.details();
	
	
}
}

