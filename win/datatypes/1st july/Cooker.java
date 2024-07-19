class Cooker
{
	public static void fastcooking()
	{
		String expellingAir="vessel ";
		String cookQuickly="electric oven cookers";
		boolean cookfood=expellingAir==cookQuickly;
        System.out.println("cookfood:"+cookfood);	
		
		String bike="bullet";
        String car="porsche";
		boolean vehicals=bike==car;
		System.out.println("vehicals:"+vehicals);
		boolean vehical=cookQuickly==car;
		System.out.println("vehical:"+vehical);
		
	}
	public static void main(String[] args)
	{
		fastcooking();
	}
}