package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketBookDto;

public interface TicketBookService {
	boolean validateAndSave(TicketBookDto ticketBookDto);

}
