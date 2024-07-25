class ChargerRunner
{
	public static void main(String[] args)
	{
	Charger charger=new Charger();
	charger.company="Tata Power";
   charger.price=250;
   int quantity=charger.quantity;
   System.out.println("charger company:"+charger.company);
   System.out.println("charger price:"+charger.price);
    System.out.println("charger quantity:"+quantity);
	Charger charger1=new Charger();
charger1.company="SparkCharge";
   charger1.price=400;
   charger1.quantity=10;
   System.out.println("charger updated company:"+charger1.company);
   System.out.println("charger  updated price:"+charger1.price);
    System.out.println("chargerupdated  quantity:"+charger1.quantity);
	
	System.out.println("==========================================");
	Claw claw=new Claw();
	claw.clawUse="climbing";
	claw.clawColor="grey";
	int noOfClaw=claw.noOfClaw;
	System.out.println(" clawUse:"+claw.clawUse);
   System.out.println("clawColor:"+claw.clawColor);
    System.out.println("noOfClaw quantity:"+noOfClaw);
	Claw claw1=new Claw();
	claw1.clawUse="digging";
	claw1.clawColor="creamish";
	claw1.noOfClaw=5;
	System.out.println(" updated clawUse:"+claw1.clawUse);
   System.out.println(" updated clawColor:"+claw1.clawColor);
    System.out.println(" updated noOfClaw quantity:"+claw1.noOfClaw);
		System.out.println("==========================================");
		
		Crow crow=new Crow();
		crow.scientificname="Corvus";
       crow.family="Corvidae";
	   int lifeSpan=crow.lifeSpan;
	   System.out.println("crow scientificname:"+crow.scientificname);
	   System.out.println("crow family:"+crow.family);
	   System.out.println("crow lifeSpan:"+lifeSpan);
	   Crow crow1=new Crow();
		crow1.scientificname="Corvuses";
       crow1.family="Corvinae";
	   crow1.lifeSpan=20;
	   System.out.println("crow updated scientificname:"+crow1.scientificname);
	   System.out.println("crow updated  family:"+crow1.family);
	   System.out.println("crow  updated lifeSpan:"+crow1.lifeSpan);
	   System.out.println("==========================================");
	   Clock clock=new Clock();
	   clock.clockCompany="quartz";
	   clock.price=1000;
	   int clockHands=clock.clockHands;
	   System.out.println("clock company:"+clock.clockCompany);
	   System.out.println("clock price:"+ clock.price);
	   System.out.println("clock hands:"+clockHands);
	   Clock clock1=new Clock();
	   clock1.clockCompany="quartz";
	   clock1.price=1000;
	   clock1.clockHands=4;
	   System.out.println("clock company:"+clock1.clockCompany);
	   System.out.println("clock price:"+ clock1.price);
	   System.out.println("clock hands:"+clock1.clockHands);
	   
	   System.out.println("==========================================");
	   Lolipop lolipop=new Lolipop();
	   lolipop.brand="catberry";
	   lolipop.lolopopColor="choclate";
	   int l_quantity=lolipop.l_quantity;
	   System.out.println("lolipop brand:"+lolipop.brand);
	    System.out.println("lolipop lolopopColor:"+ lolipop.lolopopColor);
		 System.out.println("lolipop l_quantity:"+l_quantity);
		 
		 Lolipop lolipop1=new Lolipop();
	   lolipop1.brand="catberry";
	   lolipop1.lolopopColor="choclate";
	    lolipop1.l_quantity=4;
	   System.out.println("lolipop updated brand:"+lolipop1.brand);
	    System.out.println("lolipop updated  lolopopColor:"+ lolipop1.lolopopColor);
		 System.out.println("lolipop  updated l_quantity:"+lolipop1.l_quantity);
		 System.out.println("==========================================");
		 Jean jean=new Jean();
		 jean.brand="levis";
		 jean.size='M';
		 double price=jean.price;
		 System.out.println("jean brand:"+ jean.brand);
		 System.out.println("jean size:"+ jean.size);
		 System.out.println("jean price:"+ price);
		 
		  Jean jean1=new Jean();
		 jean1.brand="max";
		 jean1.size='L';
		 jean1.price=1100;
		 System.out.println("jean  updated brand:"+ jean1.brand);
		 System.out.println("jean  updated size:"+ jean1.size);
		 System.out.println("jean updated  price:"+ jean1.price);
		 System.out.println("==========================================");

		 Keyboard keyboard=new Keyboard();
		 keyboard.noOfKeys=104;
		 keyboard.brand="hp";
		 int specialcharacters=keyboard.specialcharacters;
		 System.out.println(" keyboard noOfKeys:"+keyboard.noOfKeys);
		 System.out.println(" keyboard brand:"+keyboard.brand);
		 System.out.println(" keyboard specialcharacters:"+specialcharacters);
		 Keyboard keyboard1=new Keyboard();
		 keyboard1.noOfKeys=104;
		 keyboard1.brand="hp";
		 keyboard1.specialcharacters=8;
		 System.out.println(" keyboard  updated noOfKeys:"+keyboard1.noOfKeys);
		 System.out.println(" keyboard  updated brand:"+keyboard1.brand);
		 System.out.println(" keyboard  updated specialcharacters:"+keyboard1.specialcharacters);
		System.out.println("==========================================");

		 Mountain mountain=new Mountain();
		 mountain.mountainType="Fold mountains";
		 mountain.height=150;
		 boolean isAtRiver=mountain.isAtRiver;
		 System.out.println(" mountainType:"+mountain.mountainType);
		 System.out.println(" height:"+mountain.height);
		 System.out.println(" isAtRiver:"+isAtRiver);
		 Mountain mountain1=new Mountain();
		 mountain1.mountainType="Valcano mountains";
		 mountain1.height=250;
		  mountain1.isAtRiver=false;
		 System.out.println(" mountanType updated:"+mountain1.mountainType);
		 System.out.println(" height updated:"+mountain1.height);
		 System.out.println(" isAtRiver updated:"+mountain1.isAtRiver);
		 		System.out.println("==========================================");

		 Stadium stadium=new Stadium();
		 stadium.name="ram mandhir stadium";
		 stadium.location="5th block";
		 int size=stadium.size;
		 System.out.println("stadium name:"+stadium.name);
		 System.out.println("stadium location:"+stadium.location);
		 System.out.println(" stadium size:"+size);
		 Stadium stadium1=new Stadium();
		 stadium1.name="kartirava stadium";
		 stadium1.location="Nandini Layout";
		 stadium1.size=300;
		 System.out.println("stadium  updated name:"+stadium1.name);
		 System.out.println("stadium updated  location:"+stadium1.location);
		 System.out.println(" stadium updated size:"+stadium1.size);
		 System.out.println("==========================================");
		 
		 Spray spray=new Spray();
		 spray.sprayType="hair spray";
		 spray.price=450;
		 int sprayQuantity=spray.sprayQuantity;
		 System.out.println("sprayType:"+spray.sprayType);
		 System.out.println("spray price:"+ spray.price);
		 System.out.println("sprayQuantity:"+sprayQuantity);
		 
		  Spray spray1=new Spray();
		 spray1.sprayType="hair spray";
		 spray1.price=450;
		  spray1.sprayQuantity=350;
		 System.out.println("updated sprayType:"+spray1.sprayType);
		 System.out.println("updated spray price:"+ spray1.price);
		 System.out.println("updated sprayQuantity:"+spray1.sprayQuantity);
		 
		 
		 
	   
	}
}
  