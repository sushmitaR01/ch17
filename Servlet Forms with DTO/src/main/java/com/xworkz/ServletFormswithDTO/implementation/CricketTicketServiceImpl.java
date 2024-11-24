package com.xworkz.ServletFormswithDTO.implementation;

import com.xworkz.ServletFormswithDTO.dto.CricketTicketDTO;
import com.xworkz.ServletFormswithDTO.service.CricketTicketService;

public class CricketTicketServiceImpl implements CricketTicketService {

	@Override
	public boolean validateAndSave(CricketTicketDTO cricketTicketDTO) {
		System.out.println("Validating  a CricketTicketService ..............");
      boolean valid=true;
		
		

		if (cricketTicketDTO != null) {
			System.out.println("cricketTicketDTO is not null it ill validate the data");
			String groundName = cricketTicketDTO.getGroundName();
			if (groundName != null && !groundName.isEmpty() && groundName.length() >= 4 && groundName.length() <= 30) {
				System.out.println("GroundName is valid");

			} else {
				System.err.println("GroundName is in-valid");
				valid=false;
			}
			String customerEmail = cricketTicketDTO.getCustomerEmail();
			if (customerEmail != null && !customerEmail.isEmpty() && customerEmail.contains("@")
					&& (customerEmail.endsWith(".com") || customerEmail.endsWith("gmail"))) {
				System.out.println("customerEmail is valid");
			} else {
				System.err.println("customerEmail is in-valid");
				valid=false;
			}
			int tickets = cricketTicketDTO.getNoOfTickets();
			int convertedtickets = Integer.valueOf(tickets);
			if (convertedtickets >= 100) {
				System.out.println("Ticket is valid");

			} else {
				System.err.println("Ticket is in-valid");
				valid = false;
			}
		}
		
		return true;
	}

}
