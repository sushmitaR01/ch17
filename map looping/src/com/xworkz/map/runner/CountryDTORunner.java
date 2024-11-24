package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.Code;
import com.xworkz.map.dto.CountryDTO;
import com.xworkz.map.dto.PresidentDTO;

public class CountryDTORunner {

	public static void main(String[] args) {
		Map<CountryDTO, PresidentDTO> map = new HashMap<>();
		map.put(new CountryDTO("India", Code.INDIA), new PresidentDTO("Draupadi Murmu", "IDK", 66,
				new AddressDTO(9876543982L, "RajpathMarg", "New Delhi", "Delhi", new CountryDTO("India", Code.INDIA))));
		map.put(new CountryDTO("France", Code.FRANCE), new PresidentDTO("Emmanuel Macron", "IDK", 46,
				new AddressDTO(7865423459L, "SaintHonore", "Paris", "Ilede", new CountryDTO("France", Code.FRANCE))));
		map.put(new CountryDTO("USA", Code.UNITED_STATES),
				new PresidentDTO("Joe Biden", "IDK", 81, new AddressDTO(7654893215L, "Avenue", "Washington DC", "DC",
						new CountryDTO("USA", Code.UNITED_STATES))));
		map.put(new CountryDTO("Brazil", Code.BRAZIL), new PresidentDTO("Silva", "IDK", 78, new AddressDTO(5675432198L,
				"Praca", "Brasilia", "Distrito Federal", new CountryDTO("Brazil", Code.BRAZIL))));
		map.put(new CountryDTO("Japan", Code.JAPAN),
				new PresidentDTO("Fumio Kishida", "IDK", 67, new AddressDTO(7865423901L, "Nagata", "Tokyo",
						"Tokyo Metropolis", new CountryDTO("Japan", Code.JAPAN))));

		Set<CountryDTO> keys = map.keySet();
		keys.forEach(System.out::println);
		keys.forEach((ref) -> System.out.println(ref.getCode().getCountryCode()));
		System.out.println("-------------------------------------");
		Collection<PresidentDTO> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<CountryDTO, PresidentDTO>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}
