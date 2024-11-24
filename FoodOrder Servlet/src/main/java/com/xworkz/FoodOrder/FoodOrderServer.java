package com.xworkz.FoodOrder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")
public class FoodOrderServer extends HttpServlet {

	private PrintWriter writer;

	public FoodOrderServer() {
	System.out.println("Created no-arg const of FoodOrderServer");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of FoodOrderServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in FoodOrderServlet...");
		String itemName = req.getParameter("itemName");
		String quantity = req.getParameter("quantity");
		String price = req.getParameter("price");
		System.out.println("ItemName:" + itemName);
		System.out.println("Quantity:" + quantity);
		System.out.println("Price:" + price);
		boolean valid = true;
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		
		writer.println("</h1>");
		if (quantity != null) {
			int convertedQuantity = Integer.valueOf(quantity);
			if (convertedQuantity > 0) {
				System.out.println("Quantity is valid");
			} else {
				valid = false;
				writer.println("span style=\"color:red\">");
				System.out.println("Quantity is invalid");
				writer.println("</span>");
			}
		}
		if (price != null) {
			double convertedPrice = Double.valueOf(price);
			if (convertedPrice > 20) {
				System.out.println("Price is valid");
			} else {
				valid = false;
				writer.println("span style=\"color:red\">");
				System.out.println("Price is invalid");
				writer.println("</span>");
			}
		}
		if (valid) {
			writer.println("<h1> Order is Success :" + itemName + "</h1>");
		}
		writer.println("</body>");
		writer.println("</html>");

	}

}
