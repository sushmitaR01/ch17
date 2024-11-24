package com.xworkz.signupform.serviceImpl;

import com.xworkz.signupform.Service.SignUpService;
import com.xworkz.signupform.dto.SignUPDto;

public class SignUpServiceImpl implements SignUpService {

	@Override
	public boolean validateAndSave(SignUPDto signUPDto) {
		System.out.println("Start valdating the signup dto ");
		boolean valid = true;
		if (signUPDto != null)
			System.out.println("sign up dto is not null start the validation ");
		String userid = signUPDto.getUserid();
		if (userid != null && !userid.isEmpty() && userid.length() >= 4 && userid.length() <= 10) {
			System.out.println("userid is valid");

		} else {
			System.err.println("userid is in-valid");
			valid = false;
		}

		String email = signUPDto.getEmail();
		if (email != null && !email.isEmpty() && email.contains("@")
				&& (email.endsWith(".com") || email.endsWith("gmail"))) {
			System.out.println("Email is valid");
		} else {
			valid = false;
			System.err.println("Email is in-valid");
			
		}
		String password = signUPDto.getPassword();
		String confirmpassword = signUPDto.getConfirmpassword();

		if (password != null && !password.isEmpty() && password.length() > 3 && password.length() <= 10
				&& confirmpassword.equals(password)) {
			System.out.println("Password is valid");
		} else {
			valid = false;
			System.err.println("Password is in-valid");
			
		}
		return valid;
	}

}
