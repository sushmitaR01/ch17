package com.xworkz.boot.dto;

public class HRDto {

	private String name;
	private String qualification;
	private int totalExp;
	private String location;

	public HRDto() {
		System.out.println("Created a  no arg cons.........");
	}

	public HRDto(String name, String qualification, int totalExp, String location) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.totalExp = totalExp;
		this.location = location;
	}

	@Override
	public String toString() {
		return "HRDto [name=" + name + ", qualification=" + qualification + ", totalExp=" + totalExp + ", location="
				+ location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
