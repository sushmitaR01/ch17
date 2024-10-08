package com.xworkz.enumprograms;

public class Runner {

	public static void main(String[] args) {
		 CustemerDTO customer = new CustemerDTO("Shruti r ", "shruti@gmail.com", ProductType.KITCHEN);
	        customer.printDetails();
	        
	        
	        System.out.println("=====================");
	        
	        TicketBookDTO ticket = new TicketBookDTO("Inception", "PVR Cinemas", TicketType.ONLINE, SeatType.RECLINER);
	        ticket.printDetails();

	}

}
