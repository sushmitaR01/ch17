package com.xworkz.rules.examples.impl;

import com.xworkz.rules.examples.TrafficRule;

public class SignalLight implements TrafficRule {

	public SignalLight() {

		super();
		System.out.println("running no-args const in SignalLight");
	}

	public boolean WearSeatbelts() {
		System.out.println("running WearSeatbelts");
		return true;
	}

	public int ObeySpeedLimits() {
		System.out.println("running ObeySpeedLimits");
		return 1;
	}

	public boolean StopatRedLights() {
		System.out.println("running StopatRedLights");
		return true;
	}

	public String UseIndicators() {
		System.out.println("running UseIndicators");
		return "Left & Right";

	}

	public boolean NoMobilePhoneUse() {
		System.out.println("running NoMobilePhoneUse");
		return true;
	}

	public int noOfLights() {
		System.out.println("running noOfLights");
		return 4;
	}

	public String MaintainSafeDistance() {
		System.out.println("running MaintainSafeDistance");
		return "maintain distance between two vehical";
	}

	public boolean AvoidStuntRiding() {
		System.out.println("running AvoidStuntRiding");
		return true;
	}

	public String FollowTrafficPoliceInstructions() {
		System.out.println("running FollowTrafficPoliceInstructions");
		return "Follow Guide Lines Of Police";

	}

	public String UseRearviewMirrors() {
		System.out.println("running UseRearviewMirrors");
		return "Left & Right mirrors";

	}

	public boolean DontCarryExcessPassengers() {
		System.out.println("running DontCarryExcessPassengers");
		return true;
	}

	public boolean NoStuntRiding() {
		System.out.println("running NoStuntRiding");
		return true;
	}

	public boolean UseHeadlightsDuringLowVisibility() {
		System.out.println("running UseHeadlightsDuringLowVisibility");
		return true;
	}

}
