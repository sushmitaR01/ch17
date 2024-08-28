package com.xworkz.datatypes;
import com.xworkz.datatypes.things.Upendra;
import com.xworkz.datatypes.things.Yash;
import com.xworkz.datatypes.things.Hat;
import com.xworkz.datatypes.things.Rajkumar;
public class HatRunner {

	public static void main(String[] args) {
		Upendra upendra=new Upendra();
		upendra.wear();//Hat-->shade(),color
		
		Yash yash=new Yash();
		Hat hat=new Hat();//local
		yash.tear(hat);
		
		Rajkumar rajkumar=new Rajkumar();
		rajkumar.hat=new Hat();// using reference
		//or
		//Hat hat2=new Hat();
		//rajkumar.hat=(hat2);
		rajkumar.fold();

	}

}
