package com.xworkz.standard.repository.service;

import com.xworkz.standard.repository.StudentRepository;

public class StudentRepoService {
	
	private StudentRepository studentRepository;

	public StudentRepoService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public void run() {
		if(studentRepository!=null) {
			studentRepository.saveData();
		}
	}

}
