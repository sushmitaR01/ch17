package com.xworkz.Collectionmethods.runner;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.Iterator;

import com.xworkz.Collectionmethods.dtos.MallDTO;
import com.xworkz.Collectionmethods.enm.LocationType;

public class MallRunner {

	public static void main(String[] args) {

		MallDTO mallDTO = new MallDTO(01, "Phoenix Marketcity", LocationType.GTWORLDMALLBENGALURU, "D.K shivukumar",
				100000);
		MallDTO mallDTO1 = new MallDTO(02, "VR Bengaluru", LocationType.ORIONMALL, "N M narayan", 10000);
		MallDTO mallDTO2 = new MallDTO(03, "Central World Plaza", LocationType.MANTRISQUAREMALL, "parashuram", 20000);
		MallDTO mallDTO3 = new MallDTO(04, "ICONSIAM", LocationType.LULUMALLBENGALURU, "Rajshekar", 400000);
		MallDTO mallDTO4 = new MallDTO(05, "SM Mall of Asia", LocationType.VRBENGALURU, "Ravikiran", 100000);
		MallDTO mallDTO5 = new MallDTO(06, "New South China Mal", LocationType.GTWORLDMALLBENGALURU, "amit", 500000);
		MallDTO mallDTO6 = new MallDTO(07, "Garuda mall", LocationType.BENGALURUCENTRALMALL, "Sudeep", 300000);
		MallDTO mallDTO7 = new MallDTO(001, "West Edmonton Mall", LocationType.MANTRISQUAREMALL, "Ramesh", 400000);
		MallDTO mallDTO8 = new MallDTO(002, "Central World Plaza", LocationType.ORIONMALL, "Basavaraj", 600000);
		MallDTO mallDTO9 = new MallDTO(10, "Golden Resources Mall", LocationType.BENGALURUCENTRALMALL, "Chirag",
				900000);

		Collection<MallDTO> collection = new LinkedList<MallDTO>();
		collection.add(mallDTO);
		collection.add(mallDTO1);
		collection.add(mallDTO2);
		collection.add(mallDTO3);
		collection.add(mallDTO4);
		collection.add(mallDTO5);
		collection.add(mallDTO6);
		collection.add(mallDTO7);
		collection.add(mallDTO8);
		collection.add(mallDTO9);

		collection.forEach((ref) -> System.out.println(ref));
		System.out.println("=============================");
		// Sort all mall by ID desc
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getId(), ref1.getId()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		
		// Sort all mall name desc order

		collection.stream().sorted(Comparator.comparing(MallDTO::getName).reversed()).collect(Collectors.toList());

		System.out.println("=============================");
		// Filter all mall by landDimension less than one lakh
		collection.stream().filter(dto -> dto.getLandDimension() < 100000)
				.sorted((dto1, dto2) -> Double.compare(dto2.getLandDimension(), dto1.getLandDimension()))
				.forEach(dto -> System.out.println(dto));

		// Difference between Iterator and ListIterator
		System.out.println("***sort****");
		System.out.println("Using Iterator to traverse:");
		Iterator<MallDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=============================");
		System.out.println("Using ListIterator to traverse in reverse:");
		@SuppressWarnings("unchecked")
		ListIterator<MallDTO> listIterator = ((LinkedList<MallDTO>) collection).listIterator(collection.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("=============================");
		// Collect only names of mall
		collection.stream().map((ref) -> ref.getName()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("=============================");

		// Collect only landDimension and sort it asc order

		Collection<Double> landDimension = collection.stream().map(MallDTO::getLandDimension).sorted()
				.collect(Collectors.toList());
		System.out.println("Land dimension in ascending order:" + landDimension);
		
		  
	     

	}

}
