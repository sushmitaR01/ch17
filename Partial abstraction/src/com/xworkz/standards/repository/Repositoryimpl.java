package com.xworkz.standards.repository;

public class Repositoryimpl implements Repository{
	
	public Repositoryimpl()
	{
		System.out.println("No args cons.......");
	}


	@Override
	public boolean save() {
		System.out.println("running in Repositoryimpl");
		return false;
	}

	@Override
	public int update() {
		System.out.println("running in Repositoryimpl");
		return 0;
	}

}
