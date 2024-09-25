package com.xworkz.standard.repository;

public interface StudentRepository {
	
	void saveData();
	
	
	default int update() {
		return 2;
	}

}
