class AirConditionRunnner
{
	public static void main(String[] args)
	
	{
		
		System.out.println("starting main in AirCondition");
		AirCondition aircondition=new AirCondition();
	String ref=AirCondition.name;
	double ref1=AirCondition.price;
	int ref2=AirCondition.quantity;
	System.out.println("AirCondition name:"+ref);
	System.out.println("AirCondition price:"+ref1);
	System.out.println("AirCondition quantity:"+ref2);
			System.out.println("ending  main in AirCondition");
	}
}