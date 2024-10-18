package com.xworks.Jet.firstServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Order")

public class ResponseServer extends HttpServlet{
	
	public ResponseServer()
	{
		System.out.println("Created ResponseServlet....");
	}
	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException
	{
		System.out.println("Running service in ResponseServlet");
		
		String customername= req.getParameter("customername");
		String item=req.getParameter("item");
		String quantity=req.getParameter("quantity");
		
		
		System.out.println("customer name :" +customername);
		System.out.println("item :" +item);
		System.out.println("quantity :" +quantity);
	}


}
