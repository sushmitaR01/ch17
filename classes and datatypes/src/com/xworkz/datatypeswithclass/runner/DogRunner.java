package com.xworkz.datatypeswithclass.runner;
import com.xworkz.datatypeswithclass.things.Dog;
import com.xworkz.datatypeswithclass.things.Lucky;
import com.xworkz.datatypeswithclass.things.Prada;
import com.xworkz.datatypeswithclass.things.Ruby;
import com.xworkz.datatypeswithclass.things.Buddy;

public class DogRunner {

	public static void main(String[] args) {
		Ruby ruby=new Ruby();
		ruby.Rubydogy();
		System.out.println("==============================");
		
		Dog dog1=new Dog("Rottweiler","Grey","Terrier Group");
		Prada prada=new Prada();
		prada.wagging(dog1);
		System.out.println("==============================");
		
		Buddy buddy=new Buddy(dog1);
		buddy.bite();
		System.out.println("==============================");
		
		Lucky lucky=new Lucky();
		lucky.health();
		System.out.println("==============================");
		
		
		

	}

}
