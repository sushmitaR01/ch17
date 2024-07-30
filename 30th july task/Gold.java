class Gold
{
	int carat;
	double cost;
	
	Gold(int caratLocal,double costLocal)
	{
		System.out.println("Creating using int, double const");
		System.out.println("Carat:"+carat);
		System.out.println("Cost:"+cost);
		System.out.println("CaratLocal:"+caratLocal);
		System.out.println("CostLocal:"+costLocal);
		
		carat=caratLocal;
		cost=costLocal;
		
		System.out.println("Carat updated:"+carat);
		System.out.println("Cost updated:"+cost);
	}
}
