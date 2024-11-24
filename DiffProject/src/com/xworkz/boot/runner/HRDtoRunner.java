package com.xworkz.boot.runner;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.boot.dto.HRDto;

public class HRDtoRunner {

	public static void main(String[] args) {
		HRDto HRDto1 = new HRDto("Deepa", "M.com", 4, "rr nagar");
		HRDto HRDto2 = new HRDto("Naveen", "B.com", 2, "btm layout");
		HRDto HRDto3 = new HRDto("Vrushank", "MA", 1, "KBS");
		HRDto HRDto4 = new HRDto("Samanvi", "B.E", 9, "Mahalaxmi layout");
		HRDto HRDto5 = new HRDto("AChuki", "M.com", 8, "pennya");
		HRDto HRDto6 = new HRDto("akshatha", "B.com", 5, "JP nagar");
		HRDto HRDto7 = new HRDto("Niveditha", "BA", 4, "rr nagar");
		HRDto HRDto8 = new HRDto("Mamatha", "B.E", 3, "Nelamangala");
		HRDto HRDto9 = new HRDto("kiranr", "M.com", 1, "White field");
		HRDto HRDto10 = new HRDto("sushmita", "MA", 2, "rr nagar");

		Collection<HRDto> collection = new LinkedList<HRDto>();
		collection.add(HRDto1);
		collection.add(HRDto2);
		collection.add(HRDto3);
		collection.add(HRDto4);
		collection.add(HRDto5);
		collection.add(HRDto6);
		collection.add(HRDto7);
		collection.add(HRDto8);
		collection.add(HRDto9);
		collection.add(HRDto10);

		collection.forEach((ref) -> System.out.println(ref));
		// find all hr from a location
		System.out.println("---------------------------------------------");

		collection.stream().map((ref) -> ref.getLocation()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------------------------------------------");
		// find all hr totalExp greater than 5

		collection.stream().filter(dto -> dto.getTotalExp() > 5)
				.sorted((dto1, dto2) -> Double.compare(dto2.getTotalExp(), dto1.getTotalExp()))
				.forEach(dto -> System.out.println(dto));
		System.out.println("---------------------------------------------");
		// find all hr name ending with r case in-sensitive
		collection.stream().filter((ref) -> ref.getName().endsWith("r")).forEach((ref) -> System.out.println(ref));
		System.out.println("---------------------------------------------");
		// get only locations
		collection.stream().map((ref) -> ref.getLocation()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------------------------------------------");
		// get only name
		collection.stream().map((ref) -> ref.getName()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------------------------------------------");
		// sort hr by name and qualification
		Collection<String> name = collection.stream().map(HRDto::getName).sorted().collect(Collectors.toList());
		System.out.println("name in ascending order:" + name);
		Collection<String> qualification = collection.stream().map(HRDto::getQualification).sorted()
				.collect(Collectors.toList());
		System.out.println("qualification in ascending order:" + qualification);
		System.out.println("---------------------------------------------");
		// sort hr totalExp in desc
		collection.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println("---------------------------------------------");
		// Iterator to remove if hr name starts with A
		Iterator<HRDto> iterator = collection.iterator();

		while (iterator.hasNext()) {
			HRDto ref1 = iterator.next();
			System.out.println(ref1);

			if (ref1.getName().startsWith("A")) {
				iterator.remove();
				System.out.println("Removed item that starts with A: " + ref1);
			}

		}
		System.out.println("========================================");
		// ListIterator to traverse in backward direction
		ListIterator<HRDto> listIterator = ((LinkedList<HRDto>) collection).listIterator(collection.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}

	}
}
