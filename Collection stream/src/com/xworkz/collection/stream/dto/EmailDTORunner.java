package com.xworkz.collection.stream.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.xworkz.collection.stream.EmailDTO;

public class EmailDTORunner {

	public static void main(String[] args) {
	
		
		EmailDTO emailDTO1=new EmailDTO("Laxmi@gmail.com","Sushmita@gmail.com","applyimg leave","Approving for leave");
		EmailDTO emailDTO2=new EmailDTO("xworkz@gmail.com","mamatha@gmail.com","applying for holiday","need a leave for deepavali holiday");
		EmailDTO emailDTO3=new EmailDTO("tejashwani@gmail.com","sudeep@gmail.com","applyimg seek leave","Approving for a seek  leave");
		EmailDTO emailDTO4=new EmailDTO("deepa@gmail.com","naveen@gmail.com","completing a given work","the given work is updated");
		EmailDTO emailDTO5=new EmailDTO("Laxmi@gmail.com","channu@gmail.com","applyimg leave","Approving for leave");
		EmailDTO emailDTO6=new EmailDTO("kiran@gmail.com","nivaditha@gmail.com","reliving ","approving for a reveling ");
		
		
		Collection<EmailDTO> collection=new ArrayList<EmailDTO>();
		collection.add(emailDTO5);
		collection.add(emailDTO4);
		collection.add(emailDTO3);
		collection.add(emailDTO2);
		collection.add(emailDTO1);
		//Remove Method
		collection.forEach(ref->System.out.println(ref));
		System.out.println("Before Removal");
		EmailDTO dto=new EmailDTO("Laxmi","Sushmita","applyimg leave","Approving for leave");
		boolean removed=collection.remove(dto);
		
		
		System.out.println("After Removal");
		System.out.println("Removed:"+removed);
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		//addAll
		
		System.out.println("is empty:"+collection.isEmpty());
		   boolean value= Collections.addAll(collection,emailDTO5,emailDTO1,emailDTO2,emailDTO3,emailDTO4 );
		   System.out.println(value);
		   collection.forEach(ref->System.out.println(ref));
		   Collection<EmailDTO> collection1=new ArrayList<EmailDTO>();
		  
		   System.out.println("-----------------------------addall-------------------------------");
		   collection1.addAll(collection);
		   collection1.forEach(ref->System.out.println(ref));
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//equals()
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));  
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//hashSet
		Collection<EmailDTO> collection3 = new HashSet<>();
		collection3.add(new EmailDTO("Vrushank","Samanvi","Thank you for being amazing","Amazing"));
		collection3.add(new EmailDTO("Manjunath","Kaveri","Thank you for being amazing","Amazing"));
		System.out.println("People in the set: " + collection3);
		collection3.forEach(ref->System.out.println(ref));
		
		
		//iterator
		 System.out.println("-----------------------------");
		  Iterator<EmailDTO> iterator= collection1.iterator();
		  while(iterator.hasNext())
		  {
			  System.out.println(iterator.next());
		  }
		 
		   //size
		   System.out.println("----------------------------------------------");
		  System.out.println(collection1.size());
		 //contains
		  System.out.println("----------------------------------------");
		 System.out.println( collection.contains(emailDTO5));
		 System.out.println( collection.contains(emailDTO4));
		 //containsAll
		 System.out.println("------------------------------------------");
		 collection.add(emailDTO5);
		 System.out.println(collection.containsAll(collection1));
		  //remove
		  System.out.println("----------------------------------------------");
		   System.out.println(collection1.remove(emailDTO5));
		   System.out.println(collection1.remove(emailDTO2));
		  
		   //after remove
		   System.out.println("---------------------------------");
		   collection1.forEach(ref->System.out.println(ref));
		   
		   //remove all
		   System.out.println("-----------------------------------------");
		   collection.removeAll(collection1);
		   collection.forEach(ref->System.out.println(ref));
		   //removeIf
		   System.out.println("-------------------------------------------");  
		   boolean removedd= collection1.removeIf(ref->ref.getTo()=="gunashreebayanna@gmail.com");
		   System.out.println(removedd);
		   collection1.forEach(ref->System.out.println(ref));
		   //retainAll
		   System.out.println("---------------------------------");
		   //deletes all the elements of invoking collection.
		   collection1.retainAll(collection);  
		   System.out.println("is empty:"+collection1.isEmpty());
		   //clear
		   System.out.println("-------------------------");
		   System.out.println("is empty:"+collection.isEmpty());
		   collection.clear();
		   System.out.println("is empty:"+collection.isEmpty());
		  
	        
	        
	        
	    
		
		
		
		
		
	
	
		
	}	
		
	}


