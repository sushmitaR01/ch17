class House
{
	public static void watch(String location)
	{
		System.out.println("running watch  in House");
		Dog.guarding(location);
		System.out.println("Location:"+location);
	}
}
