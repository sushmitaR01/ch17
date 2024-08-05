class SpeakerRunner
{
	public static void main(String[] values)
	{
		Speaker speaker=new Speaker(4);
		speaker.setBrand("Bluetooth");
		speaker.cost=2000;
		speaker.display();
		
		Speaker speaker1=new Speaker(6);
		speaker1.setBrand("Home Theater");
		speaker1.cost=5000;
		speaker1.display();
		
		Speaker speaker2=new Speaker(7);
		speaker2.setBrand("Woofer of Philips");
		speaker2.cost=8000;
		speaker2.display();
		
		System.out.println("=================================================");
		
		Rocket rocket=new Rocket("India");
		rocket.speed=280;
		rocket.setNoOfThrusters("Space Shuttle");
		rocket.display();
		
		
		Rocket rocket1=new Rocket("Asia");
		rocket1.speed=1000;
		rocket1.setNoOfThrusters("LauncherOne");
		rocket1.display();
		
		
		Rocket rocket2=new Rocket("Africa");
		rocket2.speed=12000;
		rocket2.setNoOfThrusters("Terran 1");
		rocket2.display();
		System.out.println("=================================================");
		
		Chocolate chocolate=new Chocolate(200);
		chocolate.setBrand("Catberry");
		chocolate.flavour="Choclate";
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(250);
		chocolate1.setBrand("Dark");
		chocolate1.flavour="dark flavour";
		chocolate1.display();
		
		Chocolate chocolate2=new Chocolate(20);
		chocolate2.setBrand("Alpenbibe");
		chocolate2.flavour="Straberry";
		chocolate2.display();
		System.out.println("=================================================");
		
		Projector projector=new Projector("LG");
		projector.setType("liquid crystal display");
		projector.color="Black";
		projector.display();
		
		
		Projector projector1=new Projector("Epson");
		projector1.setType("digital light processing");
		projector1.color="Blue";
		projector1.display();
		
		
		Projector projector2=new Projector("BenQ");
		projector2.setType(" LED Projector ");
		projector2.color="White";
		projector2.display();
		
		System.out.println("=================================================");
		
		
		Paper paper=new Paper('M');
		paper.quality=4;
		paper.setColor("White");
		paper.display();
		
		Paper paper1=new Paper('L');
		paper1.quality=10;
		paper1.setColor("Gold");
		paper1.display();
		
		Paper paper2=new Paper('S');
		paper2.quality=20;
		paper2.setColor("Red");
		paper2.display();
		
		
		
		
		
	}
}