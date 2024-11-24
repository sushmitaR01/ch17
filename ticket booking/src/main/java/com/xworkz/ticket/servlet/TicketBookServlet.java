package com.xworkz.ticket.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticket.dto.TicketBookDto;
import com.xworkz.ticket.service.TicketBookSerImpl;
import com.xworkz.ticket.service.TicketBookService;



@WebServlet(loadOnStartup = 1,urlPatterns = "/Book")
public class TicketBookServlet extends HttpServlet{
	public TicketBookServlet() {
		System.out.println("Running a TicketBookServlet in a servlet");
	}

	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException  {
		
		String Stadiumname = arg0.getParameter("Stadiumname");
		String tickets = arg0.getParameter("tickets");
		String primaryContact = arg0.getParameter("primaryContact");
		String email = arg0.getParameter("email");
		

		int convertedticket= Integer.valueOf(tickets);
		long convertedprimaryContact = Long.valueOf(primaryContact);

		TicketBookDto ticketBookDto = new TicketBookDto(Stadiumname, convertedticket, convertedprimaryContact, email);

		TicketBookService ticketBookService = new TicketBookSerImpl();
		boolean isvalid = ticketBookService.validateAndSave(ticketBookDto);
		
		if (isvalid) {
			System.out.println("data is valid");
			arg0.setAttribute("success", Stadiumname + "ticket is booked");
		} else {
			System.out.println("data is not valid");
			arg0.setAttribute("failure", "Validation Error Tickets are not booked");
			arg0.setAttribute("dto", ticketBookDto);
		}
		System.out.println("ticketBookDto:" + ticketBookDto);
		System.out.println("after getting all par");
		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("ticket.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

	}

