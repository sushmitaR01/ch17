package com.xworkz.collection.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class LongElements {

	public static void main(String[] args) {
		
		
		Collection<Long> collection=new ArrayList<Long>();
		collection.add(6742679L);
		collection.add(986426L);
		collection.add(5621879L);
		collection.add(69876534L);
		collection.add(2987168L);
		collection.add(85627857L);
		collection.add(61874897L);
		collection.add(97435677L);
		collection.add(99724621L);
		collection.add(7426897679L);
		
		collection.forEach((ref)->System.out.println(ref));
		
		System.out.println(" Sort in ascending order");
		
		collection.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println(" Sort in descending order");
		collection.stream().sorted((ref1,ref2)->Long.compare(ref2, ref1))
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println("==================================================================");
		
		
		Collection<String> collection1=new ArrayList<String>();
		collection1.add("Jawaharlal Nehru");
		collection1.add("Gulzarilal Nanda");
		collection1.add("Lal Bahadur Shastri");
		collection1.add("Gulzarilal Nanda");
		collection1.add("Indira Gandhi");
		collection1.add("Morarji Desai");
		collection1.add("Charan Singh");
		collection1.add("Indira Gandhi");
		collection1.add("Rajiv Gandhi");
		collection1.add("Vishwanath Pratap Singh");
		collection1.add("Chandra Shekhar");
		collection1.add("P. V. Narasimha Rao");
		collection1.add("Atal Bihari Vajpayee");
		collection1.add("H. D. Deve Gowda");
		collection1.add("Inder Kumar Gujral");
		collection1.add("Atal Bihari Vajpayee");
		collection1.add("Manmohan Singh");
		collection1.add("Narendra Modi");
		
		collection1.forEach((ref)->System.out.println(ref));
		
		System.out.println(" Sort in ascending order");
		collection1.stream().sorted()
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println(" Sort in descending order");
		
		collection1.stream().sorted((ref1,ref2)->ref2.compareTo(ref1))
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		
		System.out.println("==================================================================");
  
		
		
		Collection<String> collection2=new ArrayList<String>();
		collection2.add("Andhra Pradesh");
		collection2.add("Arunachal Pradesh");
		collection2.add("Assam");
		collection2.add("Bihar");
		collection2.add("Chhattisgarh");
		collection2.add("Goa");
		collection2.add("Gujarat");
		collection2.add("Haryana");
		collection2.add("Himachal Pradesh");
		collection2.add("Jharkhand");
		collection2.add("Karnataka");
		collection2.add("Kerala");
		collection2.add("Madhya Pradesh");
		collection2.add("Maharashtra");
		collection2.add("Manipur");
	    collection2.add ("Meghalaya");
	    collection2.add("Mizoram");
	    collection2.add("Nagaland");
	    collection2.add("Odisha");
	    collection2.add("Punjab");
	    collection2.add("Rajasthan");
	    collection2.add("Sikkim");
	    collection2.add("Tamil Nadu");
	    collection2.add("Telangana");
	    collection2.add("Tripura");
	    collection2.add("Uttar Pradesh");
	    collection2.add("Uttarakhand");
	    collection2.add("West Bengal");
	    
	    
	    collection2.forEach((ref)->System.out.println(ref));
	    
	    
	    System.out.println(" Sort in ascending order");
	    collection2.stream().sorted()
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println(" Sort in descending order");
		
		collection2.stream().sorted((ref1,ref2)->ref2.compareTo(ref1))
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
	}

}
