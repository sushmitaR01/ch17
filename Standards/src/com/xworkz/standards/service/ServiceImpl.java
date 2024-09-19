package com.xworkz.standards.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImpl implements Service {

	private Repository repository;

	public ServiceImpl(Repository repository) {
		super();
		this.repository = repository;
	}

	public String push() {
		System.out.println("Running a push in a ServiceImpl ");
		if (repository != null) {
			boolean saved = repository.save();
			if (saved) {
				System.out.println("saved in repo..");
				return "success";
			} else {
				System.out.println("not saved in a repo..");
				return "failure";
			}
		}
		return "Issue";
	}

}
