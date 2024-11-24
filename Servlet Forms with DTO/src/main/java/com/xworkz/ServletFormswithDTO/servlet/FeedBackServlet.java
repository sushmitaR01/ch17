package com.xworkz.ServletFormswithDTO.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ServletFormswithDTO.dto.FeedBackDTO;
import com.xworkz.ServletFormswithDTO.implementation.CollegeServiceImpl;
import com.xworkz.ServletFormswithDTO.implementation.FeedBackServiceImpl;
import com.xworkz.ServletFormswithDTO.service.FeedBackService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/feedback")

public class FeedBackServlet extends HttpServlet {
	public FeedBackServlet() {
		System.out.println("Created no-arg const of FeedBackServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of FeedBackServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in FeedBackServlet...");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comments = req.getParameter("comments");

		FeedBackDTO feedBackDTO = new FeedBackDTO(name, email, comments);
		FeedBackService feedBackService = new FeedBackServiceImpl();
		boolean validfeedBackDTO = feedBackService.validateAndSave(feedBackDTO);
		if (validfeedBackDTO) {
			req.setAttribute("name", feedBackDTO.getName());
			System.out.println("Data is Valid");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/JobSucess.jsp");
			
			dispatcher.forward(req, resp);
		} else {
			System.err.println("Data is invalid");
		}

		System.out.println("feedBackDTO:" + feedBackDTO);
		System.out.println("after getting all par");

	}

}
