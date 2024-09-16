package com.xworkz.rules.examples.impl;

import com.xworkz.rules.examples.RailwayStationRule;

public class RailCentral implements RailwayStationRule {

	public RailCentral() {

		super();
		System.out.println("running no-args const in RailCentral");
	}

	public boolean TicketRequirement() {
		System.out.println("running TicketRequirement");
		return true;
	}

	public boolean Queueing() {
		System.out.println("running Queueing");
		return true;
	}

	public boolean Luggage() {
		System.out.println("running Luggage");
		return true;
	}

	public boolean Cleanliness() {
		System.out.println("running Cleanliness");
		return true;
	}

	public boolean NoSmoking() {
		System.out.println("running NoSmoking");
		return true;
	}

	public boolean NoAlcohol() {
		System.out.println("running NoAlcohol");
		return true;
	}

	public boolean RespectAnnouncements() {
		System.out.println("running RespectAnnouncements");
		return true;
	}

	public boolean NoLoitering() {
		System.out.println("running NoLoitering");
		return true;
	}

	public boolean SafetyFirst() {
		System.out.println("running SafetyFirst");
		return true;
	}

	public boolean NoTrespassing() {
		System.out.println("running NoTrespassing");
		return true;
	}

	public String UseFootbridges() {
		System.out.println("running UseFootbridges");
		return "Use footbridges or subways to cross platforms";

	}

	public String NoVandalism() {
		System.out.println("running NoVandalism");
		return "Do not damage station property";

	}

	public String RespectStaff() {
		System.out.println("running RespectStaff");
		return "Follow instructions from railway staff and security personnel";

	}

	public String NoLoudMusic() {
		System.out.println("running NoLoudMusic");
		return " Keep noise levels down; use headphones for personal audio";

	}

	public String NoSoliciting() {
		System.out.println("running NoSoliciting");
		return "Selling or soliciting is generally not allowed.";

	}

}
