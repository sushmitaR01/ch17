package com.xworkz.helmet.thing.runner;

public class VegaHelmetRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.helmet.thing.VegaHelmet");
			System.out.println("Running in a VegaHelmetRunner ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

	}

}
