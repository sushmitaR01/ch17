package com.xworks.research.examples;

public class Person {
	
	 String name;
     String email;
     int age;
     String mobileNo;

    public Person(String name, String email, int age, String mobileNo) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Mobile No: " + mobileNo;
    }
}




	


