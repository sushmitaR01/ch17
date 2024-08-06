class Owner
{
	String name;
	int age;
	char gender;
	
	Owner()
	{
		System.out.println("Created a Owner with no parameter constructor");
		
	}
	
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
		System.out.println("Created a Owner with  parameter constructor");
		
	}
	public void display()
	{
		System.out.println("Owner Name:"+name);
		System.out.println("Owner age:"+age);
		System.out.println("Owner gender:"+gender);
	}
	
	
	
	
}