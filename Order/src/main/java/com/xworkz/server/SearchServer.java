package com.xworkz.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/search")
public class SearchServer extends HttpServlet {

	public SearchServer() {
		System.out.println("Created SearchServer....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in SearchServer");

		String email = req.getParameter("email");
		System.out.println("email :" + email);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Search is Success for email");

	}

}
