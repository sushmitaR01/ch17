package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.Code;
import com.xworkz.map.dto.ContinentDTO;
import com.xworkz.map.dto.CountryDTO;

public class ContinentRunner {

	public static void main(String[] args) {
		List<CountryDTO> list=new LinkedList<CountryDTO>();
        list.add(new CountryDTO("India",Code.INDIA) );
        list.add(new CountryDTO("Cyprus",Code.CYPRUS) );
        list.add(new CountryDTO("Canada",Code.CANADA) );
        list.add(new CountryDTO("Grendana",Code.GRENADA) );
        list.add(new CountryDTO("Egypt",Code.EGYPT) );
        
        Map<ContinentDTO,List<CountryDTO>> map=new HashMap<>();
		map.put(new ContinentDTO("africa", 1), list.subList(0, 1));
        map.put(new ContinentDTO("America",2), list.subList(1, 2));
        map.put(new ContinentDTO("North America",3), list.subList(2, 3));
        map.put(new ContinentDTO("Antitica",4), list.subList(3, 4));
        map.put(new ContinentDTO("asia",5), list.subList(4, 5));
    	Set<ContinentDTO> keys=map.keySet();
		keys.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		Collection<List<CountryDTO>> values=map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<ContinentDTO,List<CountryDTO>>> entries=map.entrySet();
		entries.forEach((ref)->System.out.println(ref));
        
		
	

	}

}
