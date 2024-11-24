package com.xworkz.jsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jsp.dto.RegisterDto;
import com.xworkz.jsp.service.RegisterService;
import com.xworkz.jsp.serviceimpl.RegisterServicempl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")

public class RegisterServlet extends HttpServlet {
	public RegisterServlet() {
		System.out.println("no-arg const of RegisterServlet...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		int convertedAge = Integer.valueOf(age);
		req.setAttribute("name", name);

		System.out.println("after req parameters ");
		RegisterDto registerDto = new RegisterDto(name, email, convertedAge, city, state, country);

		RegisterService registerService = new RegisterServicempl();
		boolean valid = registerService.validateAndSave(new RegisterDto());

		req.setAttribute("fun", "Let me check,if its working......");
		req.setAttribute("no", 100);

		if (valid) {
			System.out.println("register is valid");
			req.setAttribute("success", "Register is Success");
		} else {
			System.out.println("register is invalid");
			req.setAttribute("failure", "Register is failure");
			req.setAttribute("dto", new RegisterDto(name, email, convertedAge, city, state, country));

		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Register.jsp");
		requestDispatcher.forward(req, resp);

	}

}
