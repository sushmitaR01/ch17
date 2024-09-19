package com.xworkz.standards.repository;

public class MachineRepositoryImpl implements MachineRepository {

	@Override
	public void save() {
		System.out.println("Running a save in a MachineRepositoryImpl");

	}

	@Override
	public int update() {
		System.out.println("Running a update in a MachineRepositoryImpl");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("Running a delete in a MachineRepositoryImpl");
		return 0;
	}

	@Override
	public int read() {
		System.out.println("Running a read in a MachineRepositoryImpl");
		return 0;
	}

}
