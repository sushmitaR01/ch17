package com.xworkz.user.service;

import com.xworkz.user.dto.UserDto;

public interface UserService {
	 boolean save(UserDto dto);
	   
	   String getlistById(int id);
	   
	   String getemailByPhone(long phone);
	   
	   String  checkEmailPassword(String email, String password);
	   
	   int deleteById(int id);
	   
	   String updatedByemail(String name,String address,String email);
	

}
