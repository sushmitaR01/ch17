package com.xworkz.collection.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.collection.stream.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {

		ProductDTO productdto = new ProductDTO(101, "maggi", "kissan", 4000);
		ProductDTO productdto1 = new ProductDTO(112, "detol", "harpi", 8000);
		ProductDTO productdto2 = new ProductDTO(113, "Eco clean detergent", "detergent", 70000);
		ProductDTO productdto3 = new ProductDTO(114, "surf excel", "detergent", 3000);
		ProductDTO productdto4 = new ProductDTO(115, "colgate", "dabur", 20000);
		ProductDTO productdto5 = new ProductDTO(116, "watch", "grt", 9000);
		ProductDTO productdto6 = new ProductDTO(118, "washing machine", "lg", 2000);
		ProductDTO productdto7 = new ProductDTO(119, "Fan", "Bajaj", 97000);
		ProductDTO productdto8 = new ProductDTO(110, "laptop", "dell", 9970);
		ProductDTO productdto9 = new ProductDTO(111, "maggi", "kissan", 98700);

		Collection<ProductDTO> collection = new ArrayList<ProductDTO>();
		collection.add(productdto);
		collection.add(productdto1);
		collection.add(productdto2);
		collection.add(productdto3);
		collection.add(productdto4);
		collection.add(productdto5);
		collection.add(productdto6);
		collection.add(productdto7);
		collection.add(productdto8);
		collection.add(productdto9);

		collection.forEach((ref) -> System.out.println(ref));

		System.out.println("============================");
		// comparator
		collection.stream().sorted().forEach(dto -> System.out.println(dto));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		// Collect product cost greater than 5000
		collection.stream().filter(dto -> dto.getCost() > 5000)
				.sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
				.forEach(dto -> System.out.println(dto));

		System.out.println("***************************************************");
		// Collect product cost greater than 5000 & less than 30000
		collection.stream().filter(dto -> dto.getCost() > 5000 && dto.getCost() < 30000)
				.sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
				.forEach(dto -> System.out.println(dto));

		System.out.println("######################################");
		// Collect product sort in desc by cost
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getCost(), ref1.getCost()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		// Collect and sort by asc by name
		collection.stream().sorted().collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref));
         //product where vendor names starts with A 
		collection.stream().filter((ref) -> ref.getVendor()
		.startsWith("A")).forEach((ref) -> System.out.println(ref));
		
		
		System.out.println("=================================================");
		//Collect product sort by cost & id
		
		collection.stream()
        .sorted(Comparator.comparingDouble(ProductDTO::getCost)
                .thenComparingInt(ProductDTO::getId)) 
        .collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//Collect only names from product
		
		collection.stream().map((ref)->ref.getName())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//Collect only id from product

		collection.stream().map((ref)->ref.getId())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// collect product by converting name to uppercase
		
		collection.stream()
		.map((ref)->ref.getName().toUpperCase())
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println("____________________________________");
		collection.stream()
		.map((ref)->ref.getVendor().toUpperCase())
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
        
	}

}
