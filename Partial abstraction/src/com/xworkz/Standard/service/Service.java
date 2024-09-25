package com.xworkz.Standard.service;

import com.xworkz.standards.repository.Repository;

public class Service implements Repository{

	@Override
	public boolean save() {
		System.out.println("Running in a Service");
		return false;
	}

	@Override
	public int update() {
		System.out.println("Running in a Service");
		return 0;
	}

}
