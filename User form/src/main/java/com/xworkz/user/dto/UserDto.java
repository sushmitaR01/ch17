package com.xworkz.user.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class UserDto {
	private int id;
	private String name;
	private long phoneno;
	private String email;
	private String password;
	private String address;
	private String city;

}
