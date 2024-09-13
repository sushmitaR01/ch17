package com.xworkz.chaining.runner;

import com.xworkz.chaining.examples.AirtelInternetProvider;
import com.xworkz.chaining.examples.BookMyShowMovie;
import com.xworkz.chaining.examples.BookMyShowMovieBookingProvider;
import com.xworkz.chaining.examples.BookingProvider;
import com.xworkz.chaining.examples.DellProvider;
import com.xworkz.chaining.examples.ExtremeAirtelInternetProvider;
import com.xworkz.chaining.examples.Fast5gExtreme;
import com.xworkz.chaining.examples.LenovoProvider;
import com.xworkz.chaining.examples.Provider;
import com.xworkz.chaining.examples.SatJioInternetProvider;
import com.xworkz.chaining.examples.jioInternetProvider;

public class ProviderRunner {

	public static void main(String[] args) {
		Provider provider=new BookingProvider("Ramesh","Maruti");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider.toString());
		System.out.println("============================");
		
		
		Provider provider1=new DellProvider("Kumar","Naveen");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider1.toString());
		System.out.println("============================");
		
		
		Provider provider2=new LenovoProvider("Sushmita","Vrushank", 20000);
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider2.toString());
		System.out.println("============================");
		
		Provider provider3=new BookMyShowMovie("Kiran","Ashwani");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider3.toString());
		System.out.println("============================");
		
		
		Provider provider4=new BookMyShowMovieBookingProvider("Navya","Kavitha",5);
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider4.toString());
		System.out.println("============================");
		
		
		Provider provider5=new AirtelInternetProvider("Namita","Nisarga");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider5.toString());
		System.out.println("============================");
		
		Provider provider6=new ExtremeAirtelInternetProvider("Nandini","Namaratha");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider6.toString());
		System.out.println("============================");
		
		
		Provider provider7=new Fast5gExtreme("Teju","Navarathan");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider7.toString());
		System.out.println("============================");
		
		Provider provider8=new jioInternetProvider("Seema","Varun");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider8.toString());
		System.out.println("============================");
		
		Provider provider9=new SatJioInternetProvider("Shaila","Savitra",20000,20-04-2024);
        provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider9.toString());
		System.out.println("============================");
	}

}
