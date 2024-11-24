package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		// Mobile AND Email

		Map<String, Long> map = new HashMap<>();
		map.put("sushmita@gmail.com", 9972462123L);
		map.put("naveen@gmail.com", 9743144249L);
		map.put("samanvi@gmail.com", 9086301256L);
		map.put("vrushank@gmail.com", 9087120806L);
		// Loop only keys
		Set<String> keys = map.keySet();
		keys.forEach(key -> System.out.println(key));
		// Loop only values

		Collection<Long> values = map.values();
		values.forEach(v -> System.out.println(v));

		// Loop all entries
		Set<Map.Entry<String, Long>> entries = map.entrySet();
		entries.forEach(entris -> System.out.println(entris.getKey() + ":" + entris.getValue()));

	}

}
