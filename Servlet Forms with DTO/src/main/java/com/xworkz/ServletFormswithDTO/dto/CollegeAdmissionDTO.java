package com.xworkz.ServletFormswithDTO.dto;

import java.math.BigDecimal;

public class CollegeAdmissionDTO {

	
	private  String name;
	private  String email;
	private  long mobile;
	private  String address;
	private  String fathername;
	private  String mothername;
	private  float percentage;
	private  String Course;
	private  int Age;
	
	
	public CollegeAdmissionDTO() {
		System.out.println("Created a no arg cons.....");
	}


	public CollegeAdmissionDTO(String name, String email, long mobile, String address, String fathername,
			String mothername, float percentage, String course, int age) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.fathername = fathername;
		this.mothername = mothername;
		this.percentage = percentage;
		this.Course = course;
		this.Age = age;
	}


	@Override
	public String toString() {
		return "CollegeAdmissionDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", fathername=" + fathername + ", mothername=" + mothername + ", percentage=" + percentage
				+ ", Course=" + Course + ", Age=" + Age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public String getMothername() {
		return mothername;
	}


	public void setMothername(String mothername) {
		this.mothername = mothername;
	}


	public float getPercentage() {
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String course) {
		Course = course;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}
	
}
