package com.xworkz.speakers.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SpeakerRunner {
	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		if (eMF != null) {
			System.out.println("this is Connected");
		} else {
			System.out.println("this is not  Connected");

		}
	}
}
