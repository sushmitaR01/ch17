package com.xworkz.hierarchical.type;

public class MedicalShopRunner {

	public static void main(String[] args) {
		ApolloMedical apolloMedical=new ApolloMedical();
		apolloMedical.help();
		apolloMedical.tablets();
		
		
		
		AsterMedical asterMedical=new AsterMedical();
		asterMedical.anytime();
	}

}
