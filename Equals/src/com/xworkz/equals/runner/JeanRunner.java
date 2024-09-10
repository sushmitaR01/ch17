package com.xworkz.equals.runner;

import com.xworkz.equals.things.Bedsheet;
import com.xworkz.equals.things.Country;
import com.xworkz.equals.things.CreditCard;
import com.xworkz.equals.things.Grinder;
import com.xworkz.equals.things.Gun;
import com.xworkz.equals.things.Helmet;
import com.xworkz.equals.things.Jeans;
import com.xworkz.equals.things.Kettle;
import com.xworkz.equals.things.Saree;
import com.xworkz.equals.things.State;

public class JeanRunner {

	public static void main(String[] args) {
		
		
		Jeans jeans1=new Jeans("Rodester",800,32);
		jeans1.setMaterial("Cotton Jean");
		jeans1.setColor("Black");
		jeans1.setNoOfPockets(5);
		
		Jeans jeans2=new Jeans("Levis", 2000, 32, "Cotton Jean", 4, "Black");
		boolean same=jeans1.equals(jeans2);
		System.out.println("Jeans1 is same as a jeans2:"+same);
		System.out.println("================================");
		
		
		Kettle kettle1=new Kettle("amazon basics", 200, 2000, "Silver", 220, "Stainless Steel");
		Kettle kettle2=new Kettle("amazon basics", 200, 2000, "Red", 250, "Stainless Steel");
		boolean check=kettle1.equals(kettle2);
		System.out.println("kettle1 is same as a kettle 2:"+check);
		System.out.println("================================");
		
		Grinder grinder1=new Grinder("ABS Plastic Body", "Butterfly", "Cherry", 11500, 13000);
		Grinder grinder2=new Grinder("Butterfly Smart ","Butterfly","Grey",20000,3899);
		boolean checked=grinder1.equals(grinder2);
		System.out.println("grinder1 is same as a grinder 2:"+checked);
		System.out.println("================================");
		
		
		Saree saree1=new Saree("Banaras", "SIlk", 10000, 2, "Pink");
		Saree saree2=new Saree("Mysor Silk", "Silk", 15000, 4, "Black");
		boolean similar=saree1.equals(saree2);
		System.out.println("saree1 is same as a saree 2:"+similar);
		System.out.println("================================");
		
		Bedsheet bedsheet1=new Bedsheet("Cotton", "Blue", 1000, 3, true, "Superfine");
		Bedsheet bedsheet2=new Bedsheet("Cotton", "Blue", 1000, 4, false, "FineCloth");
		boolean sheetsame=bedsheet1.equals(bedsheet2);
		System.out.println("bedsheet1 is same as a bedsheet 2:"+sheetsame);
		System.out.println("================================");
		
		Gun gun1=new Gun("premium", 4, 1678, "Single Action", 34, 15);
		Gun gun2=new Gun("Super quality", 5, 289, "Double Action", 78, 34);
		boolean same1=gun1.equals(gun2);
		System.out.println("gun1 is same as a gun 2:"+same1);
		System.out.println("================================");
		
		Country country1=new Country("India", "New Delhi", 10, "Karnataka", 29, 19088);
		Country country2=new Country("America", "Washington", 19, "New York", 39, 1898);
		boolean same2=country1.equals(country2);
		System.out.println("country1 is same as a country 2:"+same2);
		System.out.println("================================");
		
		State state1=new State("karnataka", "bengaluru", 8, 31, 29, 12455815);
		State state2=new State("karnataka", "bengaluru", 8, 31, 29, 12455815);
		boolean similar1=state1.equals(state2);
		System.out.println("state1 is same as a state 2:"+similar1);
		System.out.println("================================");
		
		CreditCard creditCard1 =new CreditCard("IDBC", 783, 20000, "15/06/2026", 5000, 2);
		CreditCard creditCard2 =new CreditCard("HDFC", 496, 34000, "81/03/2024", 70000, 3);
		boolean ref=creditCard1.equals(creditCard2);
		System.out.println("creditCard1 is equals to creditCard2:"+ref);
		System.out.println("================================");
		
		Helmet helmet1=new Helmet(600, "black", "vega",1200, 1, 's');
		Helmet helmet2=new Helmet(600, "red", "arai", 1200, 1, 'm');
        boolean ref1=helmet1.equals(helmet2);
        System.out.println("helmet1 is equals to helmet2:"+ref1);
	}

}
