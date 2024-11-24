package com.xworkz.thing.insects.runner;

public class ButterflyRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.thing.insects.Butterfly");
			System.out.println("Running in a ButterflyRunner");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException b) {

			b.printStackTrace();

		}

	}

}
