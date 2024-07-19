class SweetsRunner
{
	
	
	public static void main(String[] items)
	
	{
		
		System.out.println("starting main in SweetsRunner");
		
		
		String sweets1="Gulab jamun";
		String sweets2="Mysore pak";
		String sweets3="Gajar ka halwa";
		String sweets4="Jalebi";
		String sweets5="Kaju katli";
		String sweets6="Kheer";
		String sweets7="Rasgulla";
		String sweets8="Rasmalai";
		String sweets9="Kulfi";
		String sweets10="Badam Katli";
		
		//ref: element
		
		
		String[] container={sweets1,sweets2,sweets3,sweets4,sweets5,sweets6,sweets7,sweets8,sweets9,sweets10};
		
		int total=container.length;  //non-static variable
		
		System.out.println("Total items:"+total);
		
		
		String ref0=container[0];
		System.out.println("Element @ index 0:"+ref0);
		
		
		String ref1=container[1];
		System.out.println("Element @ index 1:"+ref1);
		
		String ref2=container[2];
		System.out.println("Element @ index 2:"+ref2);
		
		String ref3=container[3];
		System.out.println("Element @ index 3 :"+ref3);
		
		String ref4=container[4];
		System.out.println("Element @ index 4:"+ref4);
		
		String ref5=container[5];
		System.out.println("Element @ index 5=:"+ref5);
		
		String ref6=container[6];
		System.out.println("Element @ index 6:"+ref6);
		
		String ref7=container[7];
		System.out.println("Element @ index 7:"+ref7);
		
		String ref8=container[8];
		System.out.println("Element @ index 8:"+ref8);
		
		String ref9=container[9];
		System.out.println("Element @ index 9:"+ref9);
		
		}
}
