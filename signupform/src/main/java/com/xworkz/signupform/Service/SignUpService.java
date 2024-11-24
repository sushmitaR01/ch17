package com.xworkz.signupform.Service;

import com.xworkz.signupform.dto.SignUPDto;

public interface SignUpService {
	boolean validateAndSave(SignUPDto signUPDto);

}
