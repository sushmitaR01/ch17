package com.xworkz.ServletFormswithDTO.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ServletFormswithDTO.dto.CollegeAdmissionDTO;
import com.xworkz.ServletFormswithDTO.implementation.CollegeServiceImpl;
import com.xworkz.ServletFormswithDTO.service.CollegeAdmissionService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/collage")
public class CollegeAdmissionServlet extends HttpServlet {

	public CollegeAdmissionServlet() {
		System.out.println("Created no-arg const of CollegeAdmissionServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of CollegeAdmissionServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in CollegeAdmissionServlet...");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobno = req.getParameter("mobno");
		String adress = req.getParameter("adress");
		String fathername = req.getParameter("fathername");
		String mothername = req.getParameter("mothername");
		String percentage = req.getParameter("percentage");
		String course = req.getParameter("course");
		String age = req.getParameter("age");

		// print it or debug mode
		System.out.println("after getting all par");
		long convertednumber = Long.valueOf(mobno);
		int convertedAge = Integer.valueOf(age);
		float convertedpercentage = Float.valueOf(percentage);
		req.setAttribute("name", name);

		CollegeAdmissionDTO collegeAdmissionDTO = new CollegeAdmissionDTO(name, email, convertednumber, adress,
				fathername, mothername, convertedpercentage, course, convertedAge);
		CollegeAdmissionService collegeAdmissionService = new CollegeServiceImpl();
		boolean validcollegeAdmissionDTO = collegeAdmissionService.validateAndSave(collegeAdmissionDTO);
		if (validcollegeAdmissionDTO) {
			System.out.println("Data is Valid");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("/JobSucess.jsp");
			
			dispatcher.forward(req, resp);
			
		} else {
			System.err.println("Data is invalid");
		}

		System.out.println("collegeAdmissionDTO:" + collegeAdmissionDTO);
		System.out.println("after getting all par");

	}

}
