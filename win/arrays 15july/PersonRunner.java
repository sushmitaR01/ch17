class PersonRunner
{
	public static void main(String[] personInfos)
	{
		System.out.println("Start main in the personRunner");
		if(personInfos.length==4)
			
		{
			System.out.println("Getting 4 references from main");
			String name=personInfos[0];
			String email=personInfos[1];
			String age=personInfos[2];
			String password=personInfos[3];
			
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("Age:"+age);
			System.out.println("Password:"+password);
		}
		else
		{
			System.out.println("not enough references ");
		}
	System.out.println("end in first main personRunner");
}
}