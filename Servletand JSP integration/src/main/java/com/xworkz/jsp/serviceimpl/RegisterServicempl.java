package com.xworkz.jsp.serviceimpl;

import com.xworkz.jsp.dto.RegisterDto;
import com.xworkz.jsp.service.RegisterService;

public class RegisterServicempl implements RegisterService{

	@Override
	public boolean validateAndSave(RegisterDto registerDto) {
		System.out.println("start valaditing registerDto in a service method");
		 
		boolean valid=true;

		if (registerDto != null) {
			System.out.println("collage dto is not null it ill validate the data");
			String name = registerDto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 4 && name.length() <= 30) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is in-valid");
				valid=false;
			}
			String email = registerDto.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Email is valid");
			} else {
				System.err.println("Email is in-valid");
				valid=false;
			}
			int age = registerDto.getAge();
			int convertedAge = Integer.valueOf(age);
			if (convertedAge >= 21) {
				System.out.println("Age  is valid");
			} else {
				System.err.println("Age  is in-valid");
				valid=false;
			}
			
		
	}
		return true;

	}
}
