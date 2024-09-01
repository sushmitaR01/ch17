package com.xworkz.revati.runner;
import com.xworkz.revati.internal.OnlineMarket;
import com.xworkz.revati.internal.SuperMarket;



		public class MarketRunner {

			public static void main(String[] args) {
				
				SuperMarket supermarket= new SuperMarket("MG Road", "Navarang", "Fruit", "All Vegitables");
				supermarket.show();
				System.out.println("--------------------");
				SuperMarket supermarket1= new SuperMarket("J P Nagar", "Mahalaxmi Layout", "Hotel", "All");
				supermarket1.show();
				System.out.println("--------------------");
				
				OnlineMarket onlinemarket= new OnlineMarket("Vegitable");
				onlinemarket.show();
				System.out.println("--------------------");
				
				OnlineMarket onlinemarket1= new OnlineMarket("Fruits");
				onlinemarket1.show();
				
			}

		}

	


