package com.xworkz.research.runner;

import com.xworks.research.examples.Person;

public class PersonRunner {

	public static void main(String[] args) {
		Person person1 = new Person("Vrushank", "Vrushank@example.com", 21, "99721567890");
        Person person2 = new Person("Samanvi", "Samanvi@example.com", 22, "9876543210");
        Person person3 = new Person("Seema", "Seema@example.com", 43, "6363234567");
        Person person4 = new Person("Varun", "Varun@example.com", 29, "7890123456");
        Person person5 = new Person("Navya", "Navya@example.com", 20, "99722213579");

        
        Person[] persons = {person1, person2, person3, person4, person5};

        
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
		
		
		
}
		

	


