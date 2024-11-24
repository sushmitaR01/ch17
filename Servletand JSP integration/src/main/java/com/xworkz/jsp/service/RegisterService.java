package com.xworkz.jsp.service;

import com.xworkz.jsp.dto.RegisterDto;

public interface RegisterService {
	
	boolean validateAndSave(RegisterDto registerDto);
	

}
