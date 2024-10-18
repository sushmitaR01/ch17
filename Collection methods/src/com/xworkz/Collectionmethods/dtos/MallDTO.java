package com.xworkz.Collectionmethods.dtos;


import com.xworkz.Collectionmethods.enm.LocationType;

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




public class MallDTO {
	private int id;
	private String name;
	private LocationType locationType;
	private String owner;
	private double landDimension;
	
	}
	
	

	

	
	
	


