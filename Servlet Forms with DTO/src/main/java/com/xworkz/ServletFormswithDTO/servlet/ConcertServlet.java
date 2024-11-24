package com.xworkz.ServletFormswithDTO.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ServletFormswithDTO.dto.ConcertDTO;
import com.xworkz.ServletFormswithDTO.implementation.CollegeServiceImpl;
import com.xworkz.ServletFormswithDTO.implementation.ConcertServiceImpl;
import com.xworkz.ServletFormswithDTO.service.CollegeAdmissionService;
import com.xworkz.ServletFormswithDTO.service.ConcertTicketService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/BookShow")
public class ConcertServlet extends HttpServlet {

	public ConcertServlet() {
		System.out.println("Created ConcertServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in ConcertServlet...");
		String location = req.getParameter("location");
		String artistName = req.getParameter("artistName");
		String ticketType = req.getParameter("ticketType");
		String noOfTickets = req.getParameter("noOfTickets");
		String preferenceType = req.getParameter("preferenceType");
		int convertedNoOfTickets = Integer.valueOf(noOfTickets);

		ConcertDTO concertDTO = new ConcertDTO(location, artistName, ticketType, convertedNoOfTickets, preferenceType);
		ConcertTicketService ConcertTicketService = new ConcertServiceImpl();
		boolean validconcertDTO = ConcertTicketService.validateAndSave(concertDTO);
		if (validconcertDTO) {
			System.out.println("Data is Valid");
			req.setAttribute("name", concertDTO.getArtistName());
			RequestDispatcher dispatcher=req.getRequestDispatcher("/JobSucess.jsp");
			
			dispatcher.forward(req, resp);
		} else {
			System.err.println("Data is invalid");
		}

		System.out.println("ConcertDTO :" + concertDTO);
		System.out.println("after getting all par");
	}

}
