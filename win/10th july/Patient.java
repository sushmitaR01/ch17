class Patient
{
	public static boolean availability(String doctorName)
	{
		System.out.println("Running availability in Doctor");
		System.out.println("doctorName arg:" +doctorName);
		
		if(doctorName==" Dr.Kiran S G")
		{
			return true;
		}
		
		if(doctorName=="Dr. K.N rao")
		{
			return true;
		}
		System.out.println("Not Found");
		return false;
		
	}
	
	
	
	
public static double cancle(boolean wantToCancle)
{
  if(wantToCancle)
{
return -100;
}
else 
{
return 100;
}
}






public static void run()
{
String name="kalki";
if(name=="kalki")
{
System.out.println("will stop execution ");
return;
}
else
{
System.out.println("will continue execution ");
return;
}
return;
}
}

