package com.xworkz.map.dto;





import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class AddressDTO {
	
	private Long no;
	private String street;
	private String city;
	private String state;
	private CountryDTO countryDTO;

}
