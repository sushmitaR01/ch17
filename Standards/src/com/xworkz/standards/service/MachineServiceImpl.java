package com.xworkz.standards.service;

import com.xworkz.standards.repository.MachineRepository;

public class MachineServiceImpl implements MachineService {
	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		super();
		this.machineRepository = machineRepository;
		System.out.println("Created a Conss..");
	}

	@Override
	public String save() {
		if (machineRepository != null) {
			machineRepository.save();

		} else {
			System.out.println("repository is not null");
		}

		return null;
	}

	@Override
	public String update() {
		if (machineRepository != null) {
			int same = machineRepository.update();
			System.out.println("machineRepository update:" + same);
			if (same < 1) {
				System.out.println("machineRepository is updated");
				return "Sucess";
			} else {
				System.out.println("machineRepository is not  updated");
				return "Failure";
			}

		}
		return "Issue";
	}

	@Override
	public String delete() {
		if (machineRepository != null) {
			int sameno = machineRepository.delete();
			System.out.println("machineRepository delete:" + sameno);
			if (sameno < 1) {
				System.out.println("machineRepository is delete");
				return "Sucess";
			} else {
				System.out.println("machineRepository is not  delete");
				return "Failure";
			}

		}
		return "Issue";

	}

	@Override
	public String read() {
		if (machineRepository != null) {
			int samenos = machineRepository.read();
			System.out.println("machineRepository read:" + samenos);
			if (samenos < 1) {
				System.out.println("machineRepository is read");
				return "Sucess";
			} else {
				System.out.println("machineRepository is not  read");
				return "Failure";
			}

		}
		return "Issue";
	}

}
