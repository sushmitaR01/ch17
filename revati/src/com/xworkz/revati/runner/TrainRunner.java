package com.xworkz.revati.runner;
import com.xworkz.revati.internal.Train;
import com.xworkz.revati.internal.MetroTrain;
import com.xworkz.revati.internal.SubUrbanTrain;

public class TrainRunner {

	public static void main(String[] args) {
		
		
		
				
				MetroTrain metrotrain= new MetroTrain(987524, "Ksr Bangalore", "Hubli");
				metrotrain.display();
				System.out.println("_______________");
				
				MetroTrain metrotrain1= new MetroTrain(788655, "Dharwad Junction", "Manglore");
				metrotrain1.display();
				System.out.println("_______________");
				
				SubUrbanTrain suburbantrain= new SubUrbanTrain(567888, "Raichur");
				suburbantrain.display();
				System.out.println("_______________");
				
				SubUrbanTrain suburbantrain1= new SubUrbanTrain(987655, "Kalburgi");
				suburbantrain1.display();
				
				

				
				
			}

		}

	


