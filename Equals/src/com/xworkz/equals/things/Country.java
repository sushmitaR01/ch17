package com.xworkz.equals.things;

public class Country {
	
	private String name;
	private String capital;
	private int noOfRivers;
	private String stateName;
	private int population;
	private int code;
	public Country(String name, String capital, int noOfRivers, String stateName, int population, int code) {
		super();
		this.name = name;
		this.capital = capital;
		this.noOfRivers = noOfRivers;
		this.stateName = stateName;
		this.population = population;
		this.code = code;
	}
	@Override
		public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Country ) {
				Country country=(Country)obj;
				if(this.code==country.code&& this.population==country.population&&this.name.equals(country.name) ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no Country ");
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
		return "Country [name=" + name + ", capital=" + capital + ", noOfRivers=" + noOfRivers + ", stateName=" + stateName
				+ ", population=" + population + ", code=" + code + "]";
	}

	}


