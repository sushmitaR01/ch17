package com.xworkz.ServletFormswithDTO.implementation;

import com.xworkz.ServletFormswithDTO.dto.MovieTicketDTO;
import com.xworkz.ServletFormswithDTO.service.MovieTicketService;

public class MovieTicketServiceImpl implements MovieTicketService {

	@Override
	public boolean validateAndSave(MovieTicketDTO movieTicketDTO) {
		System.out.println("Started validating all the service methods");
		boolean valid = true;

		if (movieTicketDTO != null) {
			System.out.println("movieTicketDTO w is not null it ill validate the data");
			String name = movieTicketDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 4 && name.length() <= 30) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is in-valid");
				valid = false;
			}
		}
		int tickets = movieTicketDTO.getTotalTickets();
		int convertedtickets = Integer.valueOf(tickets);
		if (convertedtickets >= 9) {
			System.out.println("Ticket is valid");

		} else {
			System.err.println("Ticket is in-valid");
			valid = false;
		}

		double donation = movieTicketDTO.getDonation();
		double converteddonation = Double.valueOf(donation);
		if (converteddonation >= 10000) {
			System.out.println("donation is valid");

		} else {
			System.err.println("donation is in-valid");
			valid = false;
		}

		return true;
	}

}
