package com.xworkz.enumprograms;

public enum SeatType {
	
	RECLINER(90),
	PREMIUM(20),
	EXECUTIVE(120);
	
	private final int seatNo;

	private SeatType(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}
	

}
