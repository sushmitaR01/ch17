package com.xworkz.ServletFormswithDTO.service;

import com.xworkz.ServletFormswithDTO.dto.ConcertDTO;

public interface ConcertTicketService {
	boolean validateAndSave(ConcertDTO concertDTO);

}
