class RupeeRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting main in RupeeRunner");
     Rupee rupee=new Rupee();
	String symbol=rupee.symbol;
	String country= rupee.country;
	int rupeeCode= rupee.rupeeCode;
	System.out.println("Rupee symbol:"+symbol);
	System.out.println("Rupee country:"+country);
	System.out.println("Rupee rupeeCode:"+rupeeCode);
	
	System.out.println("=================================");
	
	AirCondition aircondition=new AirCondition();
	String ref=aircondition.name;
	double ref1=aircondition.price;
	int ref2=aircondition.quantity;
	System.out.println("AirCondition name:"+ref);
	System.out.println("AirCondition price:"+ref1);
	System.out.println("AirCondition quantity:"+ref2);
	
		System.out.println("=================================");
		
     Autorikshaw autorikshaw=new Autorikshaw();
	 String re=autorikshaw.name;
	 String re1=autorikshaw.color;
	 double re2=autorikshaw.price;
	 	System.out.println("Autorikshaw name:"+re);
		System.out.println("Autorikshaw color:"+re1);
		System.out.println("Autorikshaw price:"+re2);
		System.out.println("=================================");
		
	AutoDriver autoDriver=new AutoDriver();
	int age=autoDriver.age;
	String name=autoDriver.name;
	int height=autoDriver.height;
	System.out.println("autoDriver age:"+age);
	System.out.println("autoDriver name:"+name);
	System.out.println("autoDriver height:"+height);
	
	
	System.out.println("=================================");
	
	
	Rapido rapido=new Rapido();	
	double price=rapido.price;
	boolean isAvailable=rapido.isAvailable;
	int quantity=rapido.quantity;
	System.out.println("rapido price:"+price);
	System.out.println("rapido isAvailable:"+isAvailable);
	System.out.println("rapido quantity:"+quantity);
	System.out.println("=================================");
		
		CabCompany Cabcompany=new CabCompany();
	String nameOfCompany=Cabcompany.nameOfCompany;
	double price1=Cabcompany.price;
	boolean isAvailable1=Cabcompany.isAvailable;
	System.out.println("Cabcompany nameOfCompany:"+nameOfCompany);
	System.out.println("Cabcompany price:"+price1);
	System.out.println("Cabcompany isAvailable:"+isAvailable1);
	System.out.println("=================================");

	BMTC bmtc=new BMTC();
	String colour=bmtc.colour;
	String busStation=bmtc.busStation;
	long contactNo=bmtc.contactNo;
	System.out.println("BMTC colour:"+colour);
	System.out.println("BMTC busStation:"+busStation);
	System.out.println("BMTC contactNo:"+contactNo);
	System.out.println("=================================");

	
	FoodDeliveryCompany fooddeliveryCompany=new FoodDeliveryCompany();
	String companyName=fooddeliveryCompany.companyName;
	int noOfDeliveryAgent=fooddeliveryCompany.noOfDeliveryAgent;
	boolean isOperating=fooddeliveryCompany.isOperating;
	System.out.println("fooddeliveryCompany companyName:"+companyName);
	System.out.println("fooddeliveryCompany noOfDeliveryAgent:"+noOfDeliveryAgent);
	System.out.println("fooddeliveryCompany isOperating:"+isOperating);
	System.out.println("=================================");
	
System.out.println("Ending main in RupeeRunner");
	}
}