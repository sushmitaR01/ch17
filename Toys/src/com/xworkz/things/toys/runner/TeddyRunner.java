package com.xworkz.things.toys.runner;

public class TeddyRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.things.toys.Teddy");
			System.out.println("Running in a TeddyRunner");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException c) {

			c.printStackTrace();

		}

	}

}
