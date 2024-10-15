package com.xworkz.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")

public class OrderServer extends HttpServlet{
	
	public OrderServer()
	{
		System.out.println("Created OrderServer....");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException
	{
		System.out.println("Running service in OrderServer");
		
		String customername= req.getParameter("customername");
		String items=req.getParameter("items");
		String quantity=req.getParameter("quantity");
		
		
		
		
		System.out.println("customer name :" +customername);
		System.out.println("item :" +items);
		System.out.println("quantity :" +quantity);
		
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("Order is Success for item with Quantity");
		
	}


	

}
