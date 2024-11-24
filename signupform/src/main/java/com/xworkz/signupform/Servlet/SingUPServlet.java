package com.xworkz.signupform.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signupform.Service.SignUpService;
import com.xworkz.signupform.dto.SignUPDto;
import com.xworkz.signupform.serviceImpl.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SingUPServlet extends HttpServlet {
	public SingUPServlet() {
		System.out.println("Created no-arg const of SingUPServlet");
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in SingUPServlet...");
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmpassword = req.getParameter("confirmpassword");
		System.out.println("after getting all par");

	
		SignUPDto signUPDto = new SignUPDto(userid, email, password, confirmpassword);
		SignUpService SignUpService = new SignUpServiceImpl();
		boolean validSignUPDto = SignUpService.validateAndSave(signUPDto);
		if (validSignUPDto) {
			System.out.println("Data is Valid");
			req.setAttribute("id", userid);
			req.setAttribute("success", "signup is sucessfull");
			req.setAttribute("hi", "HI");

		} else {
			System.err.println("Data is invalid");
			
			req.setAttribute("failure", "signup failed");
			req.setAttribute("signUPDto", new SignUPDto(userid, email, password, confirmpassword));
			req.setAttribute("dto", new SignUPDto(userid, email) );
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("/SignUp.jsp");

		dispatcher.forward(req, resp);

		System.out.println("signUPDto:" + signUPDto);
		System.out.println("after getting all par");

	}

}
