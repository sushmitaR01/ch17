class PalaceRunner
{
	public static void main(String[] palaceInfos)
	{
		System.out.println("Start main in the PalaceRunner");
		if(palaceInfos.length==4)
			
		{
			System.out.println("Getting 4 references from main");
			String name=palaceInfos[0];
			String location=palaceInfos[1];
			String builtBy=palaceInfos[2];
			String buildYear=palaceInfos[3];
			
			System.out.println("Name:"+name);
			System.out.println("Location:"+location);
			System.out.println("BuiltBy:"+builtBy);
			System.out.println("BuildYear:"+buildYear);
		}
		else
		{
			System.out.println("not enough references ");
		}
	System.out.println("end in first main PalaceRunner");
}
}