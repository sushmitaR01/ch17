package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketBookDto;
import com.xworkz.ticket.repository.TicketRepo;
import com.xworkz.ticket.repository.TicketRepoImpl;

public class TicketBookSerImpl implements TicketBookService {

	@Override
	public boolean validateAndSave(TicketBookDto ticketBookDto) {
		boolean valid = true;

		int convertedticket = ticketBookDto.getTickets();
		if (convertedticket > 0 && convertedticket <= 10) {
			System.out.println("ticket is valid");

		} else {
			System.err.println("tickets is invalid");
			valid = false;
		}
		long convertedprimaryContact = ticketBookDto.getTickets();
		if (convertedprimaryContact <= 10) {
			System.out.println(" Contact Number is valid");
		} else {
			System.err.println("Contact Number is invalid");
			valid = false;

		}
		String email = ticketBookDto.getEmail();
		if (email != null && !email.isEmpty() && email.contains("@")
				&& (email.endsWith(".com") || email.endsWith("gmail"))) {
			System.out.println("Email is valid");
		} else {
			System.err.println("Email is in-valid");
			valid = false;
		}
		if (valid) {
			System.out.println("save date into database");
			TicketRepo repository = new TicketRepoImpl();
			int pk = repository.save(ticketBookDto);
			if (pk > 0) {
				System.out.println("data saved into database");
				valid = true;
			} else {
				System.out.println("data not saved into database");
				valid = false;
			}
		}
		return valid;
	}

}
