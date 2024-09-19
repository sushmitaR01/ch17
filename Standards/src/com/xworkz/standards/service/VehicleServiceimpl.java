package com.xworkz.standards.service;

import com.xworkz.standards.repository.VehicleRepository;

public class VehicleServiceimpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceimpl(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
		System.out.println("Created a no args cons.....");
	}

	@Override
	public String persist() {
		System.out.println("Running a persist in a VehicleServiceimpl");
		if (vehicleRepository != null) {
			vehicleRepository.save();
			System.out.println("save the persist");
			return "Saved sucessfully";
		} else {
			System.out.println("dont save the persist");
			return "not saved sucessfully";
		}
	}

	@Override
	public String merge() {
		System.out.println("Running a merge in a VehicleServiceimpl");
		if (vehicleRepository != null) {
			vehicleRepository.update();
		} else {
			System.out.println("update is null");
		}
		return "Issue";
	}

	@Override
	public String clear() {
		System.out.println("Running a clear in a VehicleServiceimpl");
		if (vehicleRepository != null) {
			boolean similar = vehicleRepository.delete();
			System.out.println("deleted vechical repository is:" + similar);
			if (similar) {
				System.out.println("delete the vehicleRepository ");
				return "Sucess";
			}
		} else {
			System.out.println("dont delete the vehicleRepository ");
			return "Fail";

		}
		return null;
	}

	@Override
	public String search() {
		System.out.println("Running a search in a VehicleServiceimpl");
		if (vehicleRepository != null) {
			String check = vehicleRepository.read();
			System.out.println("read vechical repository is:" + check);
			if (check != null) {
				System.out.println("reading is completed");
				return "Completed";
			}

		} else {
			System.out.println("reading is not  completed");
			return "Not Completed";
		}
		return null;
	}

}
