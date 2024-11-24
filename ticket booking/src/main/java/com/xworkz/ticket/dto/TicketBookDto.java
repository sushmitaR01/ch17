package com.xworkz.ticket.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class TicketBookDto {
	
	private String stadiumName;
	private int tickets;
	private long primaryContact;
	private String email;

}
