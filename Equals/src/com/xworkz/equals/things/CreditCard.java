package com.xworkz.equals.things;

public class CreditCard {
	
	
	private String type;
	private int number;
	private int limit;
	private String expDate;
	private int anualfee;
	private int interest;
	public CreditCard(String type, int number, int limit, String expDate, int anualfee, int interest) {
		super();
		this.type = type;
		this.number = number;
		this.limit = limit;
		this.expDate = expDate;
		this.anualfee = anualfee;
		this.interest = interest;
	}
	@Override
		public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CreditCard ) {
				CreditCard creditCard=(CreditCard)obj;
				if(this.limit==creditCard.limit&& this.expDate==creditCard.expDate&&this.interest==creditCard.interest ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no CreditCard ");
			}
				
		}
			else {
				System.out.println("obj is null");
			}
		
	}
			return super.equals(obj);
		}
	@Override
	public String toString() {
		return "CreditCard [type=" + type + ", number=" + number + ", limit=" + limit + ", expDate=" + expDate
				+ ", anualfee=" + anualfee + ", interest=" + interest + "]";
	}

	}


