package com.xworkz.standards.repository;

public class VehicleRepositoryimpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("Running a save in a VehicleRepositoryimpl");

	}

	@Override
	public void update() {
		System.out.println("Running a update in a VehicleRepositoryimpl");
	}

	@Override
	public boolean delete() {
		System.out.println("Running a delete in a VehicleRepositoryimpl");
		return false;
	}

	@Override
	public String read() {
		System.out.println("Running a read in a VehicleRepositoryimpl");
		return null;
	}

}
