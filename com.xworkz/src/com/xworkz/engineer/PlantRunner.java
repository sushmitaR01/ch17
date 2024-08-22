package com.xworkz.engineer;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant1=new Plant("medicine",20,15,300,"stem");
		plant1.setFruitName("Gauva");
		plant1.setFlowerName("Rose");
		plant1.setUsedtoCure("cough");
		plant1.setLocalName("Gava");
		plant1.setBotanicalName("Gauva");
		
		
		Plant plant2=new Plant("medicine",25,25,200,"leaf");
		plant2.setFruitName("neem fruit");
		plant2.setFlowerName("neem flower");
		plant2.setUsedtoCure("Asthama");
		plant2.setLocalName("neem");
		plant2.setBotanicalName("azadirachta indica");
		
		
		Plant plant3=new Plant("medicine",15,15,201,"leaf");
		plant3.setFruitName("tulsi ");
		plant3.setFlowerName("tulsi flower");
		plant3.setUsedtoCure("Asthama cold");
		plant3.setLocalName("tulsi");
		plant3.setBotanicalName("ocimum sanctum");
		
		
		Plant[] ref=new Plant[3];
		ref[0]=plant1;
		ref[1]=plant2;
		ref[2]=plant3;
		
		
		for(Plant plantTemp:ref)
		{
			System.out.println(plantTemp);
			plantTemp.display();
		}
		
		
		

	}

}
