package com.xworks.research.examples;
import java.time.LocalDate;
public class Pastdate {
	
	public static void main(String[] args) {
			LocalDate pastDate = LocalDate.now().minusDays(1); // 1 days in the past
	        System.out.println("Past Date: " + pastDate);

		}

	}


