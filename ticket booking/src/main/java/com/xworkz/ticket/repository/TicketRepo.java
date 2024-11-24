package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketBookDto;

public interface TicketRepo {
	int save(TicketBookDto ticketBookDto);

}
