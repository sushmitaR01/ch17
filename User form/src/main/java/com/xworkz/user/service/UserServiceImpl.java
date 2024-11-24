package com.xworkz.user.service;

import com.xworkz.user.dto.UserDto;
import com.xworkz.user.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	@Override
	public boolean save(UserDto dto) {
		UserRepositoryImpl userRepositoryImpl=new UserRepositoryImpl();
		userRepositoryImpl.save(dto);
		return true;
	}
    
	@Override
	public String getlistById(int id) {
		 String valid=null;
		if(id!=0) {
			System.out.println("data is not null");
			UserRepositoryImpl userRepositoryImpl=new UserRepositoryImpl();
			 valid=userRepositoryImpl.getlistById(id);
			System.out.println(valid);
			
		}
		else {
			System.out.println("data is null");
		}
		return  valid;
	}

	@Override
	public String getemailByPhone(long phoneno) {
		
			 String valid=null;
			if(phoneno!=0 ) {
				System.out.println("data is not null");
				UserRepositoryImpl userRepositoryImpl=new UserRepositoryImpl();
				 valid=userRepositoryImpl.getemailByPhone(phoneno);
			
				
			}
			else {
				System.out.println("data is null");
			}
		return valid;
	}

	@Override
	public String checkEmailPassword(String email, String password) {
		String valid=null;
		
		UserRepositoryImpl registrationRepo = new UserRepositoryImpl();
	        String res = registrationRepo.checkEmailPassword(email, password);
	        
			return res;
	        
		
	}

	@Override
	public int deleteById(int id) {
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
       int res = userRepository.deleteById(id);
		return res;
	}

	@Override
	public String updatedByemail(String name,String address,String email) {
		String valid=null;
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
	       String res = userRepository.updatedByemail(name,address,email);
		return valid;
	}


}
