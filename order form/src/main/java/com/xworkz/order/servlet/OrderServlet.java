package com.xworkz.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.order.repo.OrderRepo;
import com.xworkz.order.repo.OrderRepoImpl;
import com.xworkz.order.dto.OrderDTO;
import com.xworkz.order.service.OrderService;
import com.xworkz.order.service.OrderServiceImpl;

import data;
import lombok.Data;


@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class OrderServlet extends HttpServlet{
	
	
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String id=req.getParameter("id");
	        int idConverted=Integer.valueOf("id");
	        String name=req.getParameter("name");
	        String email=req.getParameter("email");
	        String phoneNo=req.getParameter("phoneNo");
	        long phoneNoConverted=Long.valueOf("phoneNo");
	        String password=req.getParameter("password");

	        OrderDTO dto=new OrderDTO(idConverted,name,email,phoneNoConverted,password);
	        OrderServiceImpl OrderService=new OrderServiceImpl();
	        OrderService.save(dto);
	        Data String;
			OrderService. OrderServlet(String data) 
			
	        String email;
			OrderService.getNameAndEmailById(name,email);
	        OrderDTO OrderDTO;
			OrderService.ifEmailAndPasswordSameByData(OrderDTO );
	    }
}
	    
