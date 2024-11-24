package com.xworkz.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.user.service.UserServiceImpl;
@WebServlet("/send")
public class PhoneServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String phoneno=req.getParameter("phoneno");
		long phoneno1=Long.valueOf(phoneno);
		if(phoneno!=null) {
			UserServiceImpl userServiceImpl=new  UserServiceImpl();
		String valid=userServiceImpl.getemailByPhone(phoneno1);
	     System.out.println(valid);
	     if(valid!=null) {
	    	 req.setAttribute("id", valid);
	     }
		}
		 	RequestDispatcher requestDispatcher = req.getRequestDispatcher("phone.jsp");
			requestDispatcher.forward(req, resp);
	}


}
