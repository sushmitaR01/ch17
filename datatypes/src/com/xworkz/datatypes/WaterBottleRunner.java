package com.xworkz.datatypes;
import com.xworkz.datatypes.things.Shwetha;
import com.xworkz.datatypes.things.Devu;
import com.xworkz.datatypes.things.Gunashree;
import com.xworkz.datatypes.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
        gunashree.drink();

        
        Shwetha shwetha=new Shwetha();
        WaterBottle waterBottle1=new WaterBottle();
        shwetha.wash(waterBottle1);
        
        Devu devu=new Devu();
        WaterBottle waterBottle2=new WaterBottle();
        devu.waterBottle=(waterBottle2);
        
        
        
	}

}
