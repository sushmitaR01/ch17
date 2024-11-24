package com.xworkz.set.runner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.xworkz.set.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {

		WeaponDTO weaponDTO1 = new WeaponDTO(1, "Firearms", "US", LocalDate.of(1999, 02, 01));
		WeaponDTO weaponDTO2 = new WeaponDTO(2, "Armata", "Russia", LocalDate.of(2024, 9, 03));
		WeaponDTO weaponDTO3 = new WeaponDTO(3, " sniper rifle", "china", LocalDate.of(2023, 02, 01));
		WeaponDTO weaponDTO4 = new WeaponDTO(4, "Leclerc tank", "France", LocalDate.of(2020, 02, 01));
		WeaponDTO weaponDTO5 = new WeaponDTO(5, "Eurofighter Typhoon", "UK", LocalDate.of(2019, 02, 01));
		WeaponDTO weaponDTO6 = new WeaponDTO(6, "INSAS rifle", "India", LocalDate.of(2024, 03, 06));
		WeaponDTO weaponDTO7 = new WeaponDTO(7, "G36 rifle", "Germany", LocalDate.of(2018, 02, 07));
		WeaponDTO weaponDTO8 = new WeaponDTO(8, "Galil rifle", "Israle", LocalDate.of(2020, 05, 01));
		WeaponDTO weaponDTO9 = new WeaponDTO(9, " 89 rifle", "Japan", LocalDate.of(2015, 02, 03));
		WeaponDTO weaponDTO10 = new WeaponDTO(10, " MPT-76 rifle", "Turkey", LocalDate.of(2026, 8, 01));

		Set<WeaponDTO> weaponDTO = new HashSet<>();
		weaponDTO.add(weaponDTO1);
		weaponDTO.add(weaponDTO2);
		weaponDTO.add(weaponDTO3);
		weaponDTO.add(weaponDTO4);
		weaponDTO.add(weaponDTO5);
		weaponDTO.add(weaponDTO6);
		weaponDTO.add(weaponDTO7);
		weaponDTO.add(weaponDTO8);
		weaponDTO.add(weaponDTO9);
		weaponDTO.add(weaponDTO10);

		System.out.print(weaponDTO);

		System.out.println("-----------------------------------------------------");
//Get all weapons where manfDate is greater than 2024
		weaponDTO.stream().filter(ref -> ref.getManfDate().isAfter(LocalDate.of(2024, 03, 06))).forEach(ref -> System.out.println(ref));

		System.out.println("-----------------------------------------------------");
// Get all weapons where manfDate is less than 2024
		weaponDTO.stream().filter(ref -> ref.getManfDate().isBefore(LocalDate.of(2024, 03, 06))).forEach(ref -> System.out.println(ref));

		System.out.println("-----------------------------------------------------");

		weaponDTO.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getId(), ref1.getId())) // Sort by id in
																								// descending order
				.forEach(System.out::println);
	}

}
