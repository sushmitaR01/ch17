package com.xworkz.telivision.runner;

public class MiTvRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.telivision.brand.MiTv");
			System.out.println("Running a MiTv............");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException a) {

			a.printStackTrace();

		}

	}

}
