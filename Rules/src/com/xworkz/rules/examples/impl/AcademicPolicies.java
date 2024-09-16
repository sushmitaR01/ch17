package com.xworkz.rules.examples.impl;

import com.xworkz.rules.examples.CollegeRule;

public class AcademicPolicies implements CollegeRule {

	public AcademicPolicies() {

		super();
		System.out.println("running no-args const in AcademicPolicies");
	}

	public String AttendClassesRegularly() {
		System.out.println("running AttendClassesRegularly");
		return "Attending classes manditory";

	}

	public String SubmitAssignmentsonTime() {
		System.out.println("running SubmitAssignmentsonTime");
		return "Submit the assignment with in a dead line";

	}

	public boolean MaintainAcademicIntegrity() {
		System.out.println("running MaintainAcademicIntegrity");
		return true;
	}

	public String ParticipateinClass() {
		System.out.println("running ParticipateinClass");
		return "Should be interactive in a class ";

	}

	public String FollowExamRules() {
		System.out.println("running FollowExamRules");
		return "Following a instructions of exams";

	}

	public String UseCampusResourcesResponsibly() {
		System.out.println("running UseCampusResourcesResponsibly");
		return "Using a resource correctly";

	}

	public boolean NoUnauthorizedAccess() {
		System.out.println("running NoUnauthorizedAccess");
		return true;
	}

	public boolean RespectFacultyandStaff() {
		System.out.println("running RespectFacultyandStaff");
		return true;
	}

	public boolean FollowSafetyProtocols() {
		System.out.println("running FollowSafetyProtocols");
		return true;
	}

	public String NoVandalism() {
		System.out.println("running NoVandalism");
		return "damage to college property is strictly forbidden";

	}

}
