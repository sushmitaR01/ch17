package com.xworkz.ServletFormswithDTO.implementation;

import com.xworkz.ServletFormswithDTO.dto.CollegeAdmissionDTO;
import com.xworkz.ServletFormswithDTO.service.CollegeAdmissionService;

public class CollegeServiceImpl implements CollegeAdmissionService {

	@Override
	public boolean validateAndSave(CollegeAdmissionDTO collegeAdmissionDTO) {
		System.out.println("start valaditing collegeAdmissionDTO in a service method");
		 
		boolean valid=true;

		if (collegeAdmissionDTO != null) {
			System.out.println("collage dto is not null it ill validate the data");
			String name = collegeAdmissionDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 4 && name.length() <= 30) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is in-valid");
				valid=false;
			}

			String email = collegeAdmissionDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith("gmail"))) {
				System.out.println("Email is valid");
			} else {
				System.err.println("Email is in-valid");
				valid=false;
			}
			long mobno = collegeAdmissionDTO.getMobile();
			long convertednumber = Long.valueOf(mobno);
			if (convertednumber >= 10) {
				System.out.println("Mobile Number  is valid");
			} else {
				System.err.println("Mobile Number  is in-valid");
				valid=false;
			}
			int age = collegeAdmissionDTO.getAge();
			int convertedAge = Integer.valueOf(age);
			if (convertedAge >= 21) {
				System.out.println("Age  is valid");
			} else {
				System.err.println("Age  is in-valid");
				valid=false;
			}
			float percentage = collegeAdmissionDTO.getPercentage();
			float convertedpercentage = Float.valueOf(percentage);
			if (convertedpercentage >= 65) {
				System.out.println("percentage  is valid");
				valid=false;
			} else {
				System.err.println("percentage  is in-valid");
				

			}

		}
		return true;
	}

}
