package com.xworkz.ServletFormswithDTO.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ServletFormswithDTO.dto.CricketTicketDTO;
import com.xworkz.ServletFormswithDTO.implementation.CollegeServiceImpl;
import com.xworkz.ServletFormswithDTO.implementation.CricketTicketServiceImpl;
import com.xworkz.ServletFormswithDTO.service.CollegeAdmissionService;
import com.xworkz.ServletFormswithDTO.service.CricketTicketService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/BookTickets")
public class CricketTicketServlet extends HttpServlet {

	public CricketTicketServlet() {
		System.out.println("Created CricketTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in CricketTicketServlet...");
		String groundName = req.getParameter("groundName");
		String customerNAME = req.getParameter("customerNAME");
		String customerEmail = req.getParameter("customerEmail");
		String seatType = req.getParameter("seatType");
		String noOfTickets = req.getParameter("noOfTickets");
		int convertedNoOfTickets = Integer.valueOf(noOfTickets);

		CricketTicketDTO cricketTicketDTO = new CricketTicketDTO(groundName, customerNAME, customerEmail, seatType,
				convertedNoOfTickets);

		CricketTicketService cricketTicketService = new CricketTicketServiceImpl();
		boolean validcricketTicketDTO = cricketTicketService.validateAndSave(cricketTicketDTO);
		if (validcricketTicketDTO) {
			System.out.println("Data is Valid");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/JobSucess.jsp");
			req.setAttribute("name", cricketTicketDTO.getCustomerNAME());
			dispatcher.forward(req, resp);
		} else {
			System.err.println("Data is invalid");
		}

		System.out.println("CricketTicketDTO :" + cricketTicketDTO);
		System.out.println("after getting all par");

	}
}
