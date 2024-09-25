package com.xworkz.standard.repository.runner;

import com.xworkz.standard.repository.StudentRepository;
import com.xworkz.standard.repository.StudentRepositoryimpl;

public class StudentRepoRunner {

	public static void main(String[] args) {
		StudentRepository studentRepository=new StudentRepositoryimpl();
		studentRepository.saveData();
		
		System.out.println("===========================");
		
		

	}

}
