package com.xworkz.events.service;

import com.xworkz.events.exceptions.InvalidAgeException;
import com.xworkz.events.exceptions.InvalidAmountException;
import com.xworkz.events.exceptions.InvalidEmailException;

public class EmailService {
	
	public void validateEmail(String email) throws InvalidEmailException {
		
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		 System.out.println("running save in CustomerServiceImpl");
		 if (email == null || email.startsWith(emailRegex)) {
			 System.out.println("invalid data, will stop the execution");
	            throw new InvalidEmailException();
	            
	            
	        }
		 
		 System.out.println("Validate will continue a execution");
	}
		 public void checkPrice(double price)
			{
				if(price>0 && price <=100)
				{
					System.out.println("valid price........");
				}
				else { 
					throw new InvalidAmountException(); //RuntimeException
				}
				
				}
		
	    }
		




