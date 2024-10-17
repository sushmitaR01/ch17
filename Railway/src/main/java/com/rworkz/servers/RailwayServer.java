package com.rworkz.servers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/railway")
public class RailwayServer extends HttpServlet {
	public RailwayServer() {
		System.out.println("Created RailwayServer....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in RailwayServer");

		String name = req.getParameter("firstname");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String startdate = req.getParameter("startdate");
		String returndate = req.getParameter("returndate");
		String seattype = req.getParameter("seattype");
		String totalticket = req.getParameter("totalticket");
		String Noofmale = req.getParameter("Noofmale");
		String Nooffemale = req.getParameter("Nooffemale");

		System.out.println("name :" + name);
		System.out.println("source :" + source);
		System.out.println("destination :" + destination);
		System.out.println("startdate :" + startdate);
		System.out.println("returndate :" + returndate);
		System.out.println("seattype :" + seattype);
		System.out.println("totalticket  :" + totalticket);
		System.out.println("Noofmale :" + Noofmale);
		System.out.println("Nooffemale :" + Nooffemale);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html>");
		printWriter.println("<head>");
		printWriter.println("<title>" + "railway booking" + "</title>");
		printWriter.println("</head>");
		printWriter.println("<body>");

		printWriter.println("<h4>name:" +name);
		printWriter.println("</h4>");

		printWriter.println("<h4>Source:" + req.getParameter("source"));
		printWriter.println("</h4>");

		printWriter.println("<h4>Destination:" + req.getParameter("destination"));
		printWriter.println("</h4>");

		printWriter.println("<h4>StartDate:" + req.getParameter("startdate"));
		printWriter.println("</h4>");

		printWriter.println("<h4>ReturnDate:" + req.getParameter("returndate"));
		printWriter.println("</h4>");

		printWriter.println("<h4>SeatType:" + req.getParameter("seattype"));
		printWriter.println("</h4>");

		printWriter.println("<h4>TotalTicket:" + req.getParameter("totalticket"));
		printWriter.println("</h4>");

		printWriter.println("<h4>NoofMale:" + req.getParameter("Noofmale"));
		printWriter.println("</h4>");

		printWriter.println("<h4>NoofFemale:" + req.getParameter("Nooffemale"));
		printWriter.println("</h4>");

		printWriter.println("</html>");
		printWriter.println("Railway ticket  is Successfully done");
		resp.containsHeader("Railway.html");

	}

}
