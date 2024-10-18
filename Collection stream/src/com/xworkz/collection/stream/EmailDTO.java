package com.xworkz.collection.stream;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode


public class EmailDTO implements Serializable{

	
	private String from;
	private String to;
	private String subject;
	private String message;
	
}
