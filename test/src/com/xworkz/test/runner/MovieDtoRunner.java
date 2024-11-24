package com.xworkz.test.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;



import com.xworkz.test.MovieDto;

public class MovieDtoRunner {

	public static void main(String[] args) {
		
		MovieDto movieDto=new MovieDto(11,"katira",4,"rasmikamandana");
		MovieDto movieDto1=new MovieDto(12,"kantirava",5,"ramya");
		MovieDto movieDto2=new MovieDto(13,"kranti",3,"amulya");
		MovieDto movieDto3=new MovieDto(14,"gagana",2,"hita");
		MovieDto movieDto4=new MovieDto(15,"milana",4,"rasmikamandana");
		MovieDto movieDto5=new MovieDto(16,"diya",9,"kruti");
		MovieDto movieDto6=new MovieDto(17,"dil kush",4,"spanda");
		MovieDto movieDto7=new MovieDto(18,"duniya",8,"rasmikamandana");
		MovieDto movieDto8=new MovieDto(1,"aki",2,"krupali");
		MovieDto movieDto9=new MovieDto(01,"fgh",1,"rasmikamandana");
		
		Collection<MovieDto> collection=new ArrayList<MovieDto>();
		collection.add(movieDto);
		collection.add(movieDto1);
		collection.add(movieDto2);
		collection.add(movieDto3);
		collection.add(movieDto4);
		collection.add(movieDto5);
		collection.add(movieDto6);
		collection.add(movieDto7);
		collection.add(movieDto8);
		collection.add(movieDto9);
		
		
		
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getMovieRating(), ref1.getMovieRating()))
		.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		
		System.out.println("***sort****");
		System.out.println("Using Iterator to traverse:");
		Iterator<MovieDto> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=============================");
		System.out.println("Using ListIterator to traverse in reverse:");
		@SuppressWarnings("unchecked")
		ListIterator<MovieDto> listIterator = ((LinkedList<MovieDto>) collection).listIterator(collection.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}

		
		
		
		

	}

}
