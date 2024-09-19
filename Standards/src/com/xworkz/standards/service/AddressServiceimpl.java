package com.xworkz.standards.service;

import com.xworkz.standards.repository.AddressRepository;

public class AddressServiceimpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceimpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public String push() {
		System.out.println("Running a push in a AddressServiceimpl ");
		if (addressRepository != null) {
			boolean same = addressRepository.save();
			System.out.println("push in AddressServiceimpl:" + same);
			if (same) {
				System.out.println("make a service:");
				return "Sucess";
			} else {
				System.out.println("do not make a service:");
				return "failure";

			}
		}
		return "Issue";
	}

	@Override
	public String refresh() {
		System.out.println("Running a refresh in a AddressServiceimpl ");
		if (addressRepository != null) {
			int values = addressRepository.update();
			
			if (values < 1) {
				System.out.println("update a repository:" + values);
				return "Sucess";
			} else {
				System.out.println("do not update a repository:" + values);
				return "Failure";
			}
		}
		return "Issue";
	}

	@Override
	public String remove() {
		System.out.println("Running a remove in a AddressServiceimpl ");
		if (addressRepository != null) {
			addressRepository.delete();
		} else {
			System.out.println("Adress is null");
		}
		return null;
	}

	@Override
	public String load() {
		System.out.println("Running a load in a AddressServiceimpl ");
		if (addressRepository != null) {
			String same = addressRepository.read();
			System.out.println("load in AddressServiceimpl:" +same);
			if (same != null) {
				System.out.println("Load a repositoty");
				return "Sucess";

			} else {
				System.out.println("No to Load a repositoty");
				return "Failure";

			}
		}

		return "Pending";
	}

}
