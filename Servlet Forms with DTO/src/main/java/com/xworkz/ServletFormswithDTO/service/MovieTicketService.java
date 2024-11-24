package com.xworkz.ServletFormswithDTO.service;
import com.xworkz.ServletFormswithDTO.dto.MovieTicketDTO;

public interface MovieTicketService {
	
	boolean validateAndSave(MovieTicketDTO movieTicketDTO);

}
