package com.xworks.research.examples;
import java.time.LocalDateTime;
public class futuredateTime {
	
	

		public static void main(String[] args) {
			

		LocalDateTime futureDateTime = LocalDateTime.now().plusDays(10).plusHours(5); // 10 days and 5 hours in the future
	        System.out.println("Future DateTime: " + futureDateTime);
	    }
		
	}


