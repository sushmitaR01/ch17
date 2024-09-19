package com.xworkz.standards.repository;

public class RepositoryImpl implements Repository {
	@Override
	public boolean save() {
		System.out.println("Running a save in a RepositoryImpl");
		return true;
	}

}
