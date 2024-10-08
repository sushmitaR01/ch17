package com.xworkz.lamdaFunction.functional.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.BiConsumer;

import com.xworkz.labmda.dto.CustomerDTO;

public class CustomerRunner {

	public static void main(String[] args) {

		
		CustomerDTO customerDTO1=new CustomerDTO("Rahul", 21);
		
		CustomerDTO customerDTO2=new CustomerDTO("Ramesh", 21);
		CustomerDTO customerDTO3=new CustomerDTO("Suresh", 23);
		CustomerDTO customerDTO4=new CustomerDTO("Gopi", 27);
		
		//[]
		//fix 
		//index
		//CustomerDTO[] customerDTOs= {customerDTO1,customerDTO2};
		//Collection: no fix,no index, operations : methods
		//Collection---> List ---> ArrayList,LinkedList,Set--->HashSet,LinkedHAshSet,TreeSet
		
		Collection<CustomerDTO> collection=new LinkedList<CustomerDTO>();
		collection.add(customerDTO1);
		collection.add(customerDTO2);
		collection.add(customerDTO3);
		collection.add(customerDTO4);
	//collection : 20 methods 
		Iterator<CustomerDTO> itr=collection.iterator();//access elements in collection
		
		while(itr.hasNext())//true
		{
			CustomerDTO dto=itr.next();
			if(dto.getAge()>25)
			{
				System.out.println(dto);

			}

		}
		
		
	}

}
