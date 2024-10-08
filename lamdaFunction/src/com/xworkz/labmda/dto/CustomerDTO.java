package com.xworkz.labmda.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	private String name;
	private int age;

	public CustomerDTO() {
	
	}

	public CustomerDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
