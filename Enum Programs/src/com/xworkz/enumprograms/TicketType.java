package com.xworkz.enumprograms;

public enum TicketType {
	ONLINE(150),
	OFFLINE(100);
	
	
	 private final int cost;

	TicketType(int cost) {
		 this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
	

}
