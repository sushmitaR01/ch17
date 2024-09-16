package com.xworkz.rules.examples.impl;

import com.xworkz.rules.examples.TempleRule;

public class Spiritus implements TempleRule {

	public Spiritus() {

		super();
		System.out.println("running no-args const in Spiritus");
	}

	public boolean ReverenceandRespect() {
		System.out.println("running ReverenceandRespect");
		return true;
	}

	public boolean Cleanliness() {
		System.out.println("running Cleanliness");
		return true;
	}

	public boolean Silence() {
		System.out.println("running Silence");
		return true;
	}

	public boolean Offerings() {
		System.out.println("running Offerings");
		return true;
	}

	public boolean NoSmokingorAlcohol() {
		System.out.println("running NoSmokingorAlcohol");
		return true;
	}

	public boolean RespectSacredSpaces() {
		System.out.println("running RespectSacredSpaces");
		return true;
	}

	public boolean NoPets() {
		System.out.println("running NoPets");
		return true;
	}

	public boolean RespectOtherWorshippers() {
		System.out.println("running RespectOtherWorshippers");
		return true;
	}

	public String DressCode() {
		System.out.println("running DressCode");
		return "Wear appropriate attire, often modest and clean";

	}

	public String NoPhotography() {
		System.out.println("running NoPhotography");
		return "Photography is usually prohibited inside temples";

	}

	public String RemoveFootwear() {
		System.out.println("running RemoveFootwear");
		return "In many traditions, shoes are removed before entering";

	}

	public String FollowRituals() {
		System.out.println("running FollowRituals");
		return "Participate in or observe rituals as per the temple’s customs";

	}

	public String NoCommercialActivities() {
		System.out.println("running NoCommercialActivities");
		return "Selling or buying items inside is usually not allowed";

	}

	public String GuidancefromPriests() {
		System.out.println("running GuidancefromPriests");
		return "Follow instructions from temple priests or officials";

	}

	public String NoLittering() {
		System.out.println("running NoLittering");
		return "Keep the temple premises clean.";

	}

}
