package com.xworkz.ServletFormswithDTO.implementation;

import com.xworkz.ServletFormswithDTO.dto.ConcertDTO;
import com.xworkz.ServletFormswithDTO.service.ConcertTicketService;

public class ConcertServiceImpl implements ConcertTicketService {

	@Override
	public boolean validateAndSave(ConcertDTO concertDTO) {
		System.out.println("Validating  a ConcertTicketService ..............");
		boolean valid = true;

		if (concertDTO != null) {
			System.out.println("concertDTO is not null it ill validate the data");
			String artistName = concertDTO.getArtistName();
			if (artistName != null && !artistName.isEmpty() && artistName.length() >= 4 && artistName.length() <= 30) {
				System.out.println("artistName is valid");

			} else {
				System.err.println("artistName is in-valid");
				valid = false;
			}
			int noOfTickets = concertDTO.getNoOfTickets();
			int convertedNoOfTickets = Integer.valueOf(noOfTickets);

			if (convertedNoOfTickets >= 100) {
				System.out.println("Ticket is valid");

			} else {
				System.err.println("Ticket is in-valid");
				valid = false;
			}
		}
		return true;
	}

}
