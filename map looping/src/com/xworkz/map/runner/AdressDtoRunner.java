package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.Code;
import com.xworkz.map.dto.CountryDTO;

public class AdressDtoRunner {

	public static void main(String[] args) {

		Map<String, AddressDTO> map = new HashMap<>();
		map.put("Gagan", new AddressDTO(90785434517L, "RR nagar", "Bangalore", "Karnataka",
				new CountryDTO("India", Code.INDIA)));
		map.put("Akanksha",
				new AddressDTO(98236860655L, "kavya", "kochi", " kerala", new CountryDTO("India", Code.INDIA)));
		map.put("praveen",
				new AddressDTO(9989267789L, "vrushank", "pune", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("sushmita",
				new AddressDTO(98776434567L, "ramesh", "Kolar", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("preetik",
				new AddressDTO(98877645678L, "BT Nagar", "manglore", "Karnataka", new CountryDTO("India", Code.INDIA)));
		Set<String> keys = map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<AddressDTO> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<String, AddressDTO>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}
