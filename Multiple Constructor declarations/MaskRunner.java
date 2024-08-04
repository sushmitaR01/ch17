class MaskRunner
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in MaskRunner");
		Mask mask=new Mask();
		Mask mask1=new Mask(250);
		System.out.println("cost of mask:"+mask1.cost);

		Mask mask2=new Mask('M');
		System.out.println("size of mask:"+mask2.size);

		Mask mask3=new Mask("Nylon");
		System.out.println("material of mask:"+mask3.material);
		
		
		Mask mask4=new Mask(300,'L',"Polyster");
		System.out.println("cost of mask:"+mask4.cost);
		System.out.println("size of mask:"+mask4.size);
		System.out.println("String of mask:"+mask4.material);


		
		Mask mask5=new Mask(200,'S');
		System.out.println("cost of mask:"+mask5.cost);
		System.out.println("size of mask:"+mask5.size);
		
		
		System.out.println("Ending  main in MaskRunner");
		
		System.out.println("===============================================");
		
		System.out.println("Starting main in Kerosene");
		
		Kerosene kerosene=new Kerosene();
		
		Kerosene kerosene1=new Kerosene(400,4,true);
		System.out.println("double of price:"+kerosene1.price);
		System.out.println("double of price:"+kerosene1.quantity);
		System.out.println("double of price:"+kerosene1.quality);
		
		
		
		Kerosene kerosene2=new Kerosene(false); 
		System.out.println("double of price:"+kerosene2.quality);
		
		Kerosene kerosene3=new Kerosene();
		System.out.println("double of price:"+kerosene3.price);
		System.out.println("Starting main in Kerosene");
		System.out.println("===============================================");
		
		System.out.println("Starting main in Aeroplane ");
		Aeroplane aeroplane=new Aeroplane();
		Aeroplane aeroplane1=new Aeroplane("Airbus",3,1000,"Banglore","Dubai");
		System.out.println("company of Aeroplane:"+aeroplane1.company);
		System.out.println("noOfSeats of Aeroplane:"+aeroplane1.noOfSeats);
		System.out.println("ticketPrice of Aeroplane:"+aeroplane1.ticketPrice);
		System.out.println("source of Aeroplane:"+aeroplane1.source);
		System.out.println("destination of Aeroplane:"+aeroplane1.destination);
		
		
		Aeroplane aeroplane2=new Aeroplane("Safran","Mysore","Bankong");
		System.out.println("company of Aeroplane:"+aeroplane2.company);
		System.out.println("source of Aeroplane:"+aeroplane2.source);
		System.out.println("destination of Aeroplane:"+aeroplane2.destination);
		
		
		
		Aeroplane aeroplane3=new Aeroplane("Leonardo",20000,"Delhi","Dubai");
		System.out.println("company of Aeroplane:"+aeroplane2.company);
		System.out.println("ticketPrice of Aeroplane:"+aeroplane1.ticketPrice);
		System.out.println("source of Aeroplane:"+aeroplane2.source);
		System.out.println("destination of Aeroplane:"+aeroplane2.destination);
		
		
		
		
		
	}
}

		
		