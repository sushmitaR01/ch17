package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.serviceImpl.ProductServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("createt ProductServlet const ");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String companyName = arg0.getParameter("companyName");
		String productName = arg0.getParameter("productName");
		String productType = arg0.getParameter("type");
		String productQuantiy = arg0.getParameter("productQuantiy");
		String productCost = arg0.getParameter("productCost");

		int convertedProductQuantiy = Integer.valueOf(productQuantiy);
		double convertedProductCost = Double.valueOf(productCost);

		ProductDto productDto = new ProductDto(companyName, productName, productType, convertedProductQuantiy,
				convertedProductCost);

		ProductService productService = new ProductServiceImpl();
		boolean isValid = productService.isValidAndSave(productDto);
		double total = convertedProductQuantiy * convertedProductCost;
		if (isValid) {
			System.out.println("data is valid");
			arg0.setAttribute("success", productName + "  and total is " + total);
		} else {
			System.out.println("data is not valid");
			arg0.setAttribute("failure", "Product is not valid");
			arg0.setAttribute("dto", productDto);
		}

		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("product.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}
