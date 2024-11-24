package com.xworkz.food.runner;

public class DosaRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.food.boot.Dosa");
			System.out.println("Running with a dosa");
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
