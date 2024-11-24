package com.xworkz.ServletFormswithDTO.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ServletFormswithDTO.dto.MovieTicketDTO;
import com.xworkz.ServletFormswithDTO.implementation.CollegeServiceImpl;
import com.xworkz.ServletFormswithDTO.implementation.MovieTicketServiceImpl;
import com.xworkz.ServletFormswithDTO.service.CollegeAdmissionService;
import com.xworkz.ServletFormswithDTO.service.MovieTicketService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book")

public class MovieTicketServlet extends HttpServlet {
	public MovieTicketServlet() {
		System.out.println("Created no-arg const of MovieTicketServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of MovieTicketServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in MovieTicketServlet...");
		String name = req.getParameter("name");
		String tickets = req.getParameter("tickets");
		String theater = req.getParameter("theater");
		String seattype = req.getParameter("seattype");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");

		// print it or debug mode
		System.out.println("after getting all par");
		int convertedtickets = Integer.valueOf(tickets);

		double converteddonation = Double.valueOf(donation);

		MovieTicketDTO movieTicketDTO = new MovieTicketDTO(name, convertedtickets, theater, seattype, converteddonation,
				date);

		MovieTicketService movieTicketService = new MovieTicketServiceImpl();
		boolean validcollegeAdmissionDTO = movieTicketService.validateAndSave(movieTicketDTO);
		if (validcollegeAdmissionDTO) {
			System.out.println("Data is Valid");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/JobSucess.jsp");
			req.setAttribute("name", movieTicketDTO.getName());
			dispatcher.forward(req, resp);
		} else {
			System.err.println("Data is invalid");
		}
		System.out.println("movieTicketDTO:" + movieTicketDTO);
		System.out.println("after getting all par");

	}

}
