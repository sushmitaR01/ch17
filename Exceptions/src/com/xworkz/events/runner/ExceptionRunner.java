package com.xworkz.events.runner;

import com.xworkz.events.exceptions.InvalidEmailException;
import com.xworkz.events.exceptions.InvalidNameException;
import com.xworkz.events.service.CustomerServiceImpl;
import com.xworkz.events.service.EmailService;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidNameException, ClassNotFoundException, InvalidEmailException {
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
		System.out.println("running before check age");
		customerServiceImpl.checkAge(25); // 0 //unchecked event
		System.out.println("running after check age");
		
		System.out.println("running before name method");
		customerServiceImpl.save("tejavvaa");
		System.out.println("running after name method");
		
		
		
		
		System.out.println("===================================");
		
		EmailService emailService=new EmailService();
		System.out.println("running before check email");
		emailService.validateEmail("sushmita@gmail.com");
		System.out.println("running after check email");
		
		
		System.out.println("running before check price");
		emailService.checkPrice(90);
		System.out.println("running after check price");
		
		

	}
}

	


