package com.xworkz.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.user.dto.UserDto;
import com.xworkz.user.service.UserServiceImpl;

@WebServlet("/apply")
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String phoneno = req.getParameter("phoneno");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		int id1 = Integer.valueOf(id);
		long phoneno1 = Long.valueOf(phoneno);
		System.out.println("id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", password="
				+ password + ", address=" + address + ", city=" + city);

		UserDto dto = new UserDto(id1, name, phoneno1, email, password, address, city);
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.save(dto);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("list.jsp");
		requestDispatcher.forward(req, resp);
	}

}
