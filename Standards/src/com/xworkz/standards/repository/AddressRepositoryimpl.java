package com.xworkz.standards.repository;

public class AddressRepositoryimpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("Running a save in a AddressRepositoryimpl ");
		return true;
	}

	@Override
	public int update() {
		System.out.println("Running a update in a AddressRepositoryimpl ");
		return 3;
	}

	@Override
	public void delete() {

		System.out.println("Running a delete in a AddressRepositoryimpl ");
	}

	@Override
	public String read() {
		System.out.println("Running a read in a AddressRepositoryimpl ");
		return "Completed";
	}

}
