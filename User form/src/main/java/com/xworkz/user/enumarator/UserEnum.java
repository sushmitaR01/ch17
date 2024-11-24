package com.xworkz.user.enumarator;



public enum UserEnum {
	URL("jdbc:mysql://localhost:3306/users"),USERNAME("root"),
	PASSWORD("Xworkzodc@123");
	private final String value;
	private UserEnum(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	 

}
