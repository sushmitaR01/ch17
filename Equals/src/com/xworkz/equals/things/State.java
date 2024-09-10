package com.xworkz.equals.things;

public class State {

	
	
	private String name;
	private String capital;
	private int noOfRivers;
	private int noOfDistricts;
	private int code;
	private int population;
	public State(String name, String capital, int noOfRivers, int noOfDistricts, int code, int population) {
		super();
		this.name = name;
		this.capital = capital;
		this.noOfRivers = noOfRivers;
		this.noOfDistricts = noOfDistricts;
		this.code = code;
		this.population = population;
	}
	@Override
		public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof State ) {
				State state=(State)obj;
				if(this.code==state.code&& this.population==state.population&&this.name.equals(state.name) ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no State ");
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
		return "State [name=" + name + ", capital=" + capital + ", noOfRivers=" + noOfRivers + ", noOfDistricts="
				+ noOfDistricts + ", code=" + code + ", population=" + population + "]";
	}

	}

