package com.xworkz.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServer extends HttpServlet{
	
	public ContactServer()
	{
		System.out.println("Created ContactServer....");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException
	{
		System.out.println("Running service in ContactServer");
		
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		String mobnumber=req.getParameter("mobnumber");
		String age=req.getParameter("age");
		String address=req.getParameter("address");
		
		
		
		
		System.out.println(" name :" +name);
		System.out.println("email :" +email);
		System.out.println("mobnumber :" +mobnumber);
		System.out.println("age :" +age);
		System.out.println("address :" +address);
		
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("Contact is Success ");
		
	}


	

	

}
