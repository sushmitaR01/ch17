package com.xworkz.revati.runner;
import com.xworkz.revati.internal.Government;
import com.xworkz.revati.internal.StateGovernment;
import com.xworkz.revati.internal.CentrlGovernmnet;


public class GovernmentRunner {

	public static void main(String[] args) {
		
				
				StateGovernment stategovernment= new StateGovernment("Assam", 467, "Shri Himanta Biswa Sarma", "Dr. Manik Saha");
				stategovernment.display(); 
				System.out.println("---------------");
				
				StateGovernment stategovernment1= new StateGovernment("Rajasthan", 908, "Shri Bhajan Lal Sharma", "Km. Mamata Banerjee");
				stategovernment1.display();
				System.out.println("----------------");
				
				CentrlGovernmnet centralgovernment= new CentrlGovernmnet("Tamil Nadu", 874);
				centralgovernment.display();
				System.out.println("----------------");
				
				CentrlGovernmnet centralgovernment1= new CentrlGovernmnet("Karnataka", 289);
				centralgovernment1.display();
				
			}

		}

	


