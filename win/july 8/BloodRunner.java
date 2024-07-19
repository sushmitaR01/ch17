class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in bloodrunner");
		String groups=Blood.group();
		System.out.println("groups return type:"+groups);
		
		String personName=Blood.personName();
		System.out.println("personName return type:"+personName);
		
		double cost=Blood.cost();
		System.out.println("cost return type:"+cost);
		
		int  yes=Blood.hospitalTested();
		System.out.println("yes return type:"+yes);
		
		boolean no=Blood.sicknessorNot();
		System.out.println("no return type:"+no);
		
		boolean donated=Blood.donateorNot();
		System.out.println("donated return type:"+donated);
		
	}
}
		
		
		
		
		