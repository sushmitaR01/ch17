package com.xworkz.engineer;

public class SubmarineRunner {

	public static void main(String[] args) {
		
		Submarine s1 = new Submarine("SeaWolf", "Attack", 110.0, 10.0, 9.0);
        Submarine s2 = new Submarine("Arihant", "Ballistic Missile", 111.0, 11.0, 9.5);
        Submarine s3 = new Submarine("Kilo", "Diesel-Electric", 112.0, 10.5, 9.2);

        
        s1.setPropulsionType("Nuclear");
        s1.setCrewCapacity(120);
        s1.setMaxDepth(500);
        s1.setDisplacement(8000);
        s1.setYearCommissioned(2001);
        s1.setCountryOfOrigin("USA");
        s1.setNuclearPowered(true);
        s1.setSpeed(30.5);
        s1.setArmament("Torpedoes");
        s1.setStealthCapable(true);
        s1.setSonarType("Active/Passive");
        s1.setCommunicationSystem("Satellite");
        s1.setEndurance(90.0);
        s1.setHullMaterial("Steel");
        s1.setOperatingDepth("Deep");
        s1.setRadarType("Advanced");
        s1.setHasTorpedoSystem(true);
        s1.setNumberOfMissiles(12);
        s1.setHasMineLayingCapability(true);
        s1.setElectronicWarfareSystem("ECM");
        s1.setLengthOfService(30.0);
        s1.setHasRescueSystem(true);
        s1.setOnboardComputerSystem("Intel i9");
        s1.setNavigationSystem("GPS");
        s1.setSubmersible(true);
        s1.setBatteryLife(10.0);
        s1.setHasPeriscope(true);
        s1.setCombatSystem("Aegis");
        s1.setAutonomous(false);
        s1.setNumberOfEscapePods(4);
        s1.setPaintType("Anti-corrosive");
        s1.setRefitSchedule("Every 5 years");
        s1.setHasAntiSubmarineWarfare(true);
        s1.setThermalSignature("Low");
        s1.setHasNuclearMissiles(true);

        
        s2.setPropulsionType("Diesel-Electric");
        s2.setCrewCapacity(90);
        s2.setMaxDepth(300);
        s2.setDisplacement(7000);
        s2.setYearCommissioned(2016);
        s2.setCountryOfOrigin("India");
        s2.setNuclearPowered(false);
        s2.setSpeed(20.0);
        s2.setArmament("Missiles");
        s2.setStealthCapable(false);
        s2.setSonarType("Passive");
        s2.setCommunicationSystem("Radio");
        s2.setEndurance(60.0);
        s2.setHullMaterial("Titanium");
        s2.setOperatingDepth("Mid");
        s2.setRadarType("Basic");
        s2.setHasTorpedoSystem(false);
        s2.setNumberOfMissiles(16);
        s2.setHasMineLayingCapability(false);
        s2.setElectronicWarfareSystem("None");
        s2.setLengthOfService(25.0);
        s2.setHasRescueSystem(false);
        s2.setOnboardComputerSystem("AMD Ryzen");
        s2.setNavigationSystem("INS");
        s2.setSubmersible(true);
        s2.setBatteryLife(8.0);
        s2.setHasPeriscope(false);
        s2.setCombatSystem("BrahMos");
        s2.setAutonomous(false);
        s2.setNumberOfEscapePods(2);
        s2.setPaintType("Standard");
        s2.setRefitSchedule("Every 7 years");
        s2.setHasAntiSubmarineWarfare(false);
        s2.setThermalSignature("Medium");
        s2.setHasNuclearMissiles(false);

       
        s3.setPropulsionType("Hybrid");
        s3.setCrewCapacity(100);
        s3.setMaxDepth(450);
        s3.setDisplacement(7500);
        s3.setYearCommissioned(1995);
        s3.setCountryOfOrigin("Russia");
        s3.setNuclearPowered(false);
        s3.setSpeed(25.0);
        s3.setArmament("Torpedoes");
        s3.setStealthCapable(true);
        s3.setSonarType("Advanced");
        s3.setCommunicationSystem("Encrypted Radio");
        s3.setEndurance(75.0);
        s3.setHullMaterial("Composite");
        s3.setOperatingDepth("Shallow");
        s3.setRadarType("Standard");
        s3.setHasTorpedoSystem(true);
        s3.setNumberOfMissiles(10);
        s3.setHasMineLayingCapability(true);
        s3.setElectronicWarfareSystem("Advanced");
        s3.setLengthOfService(35.0);
        s3.setHasRescueSystem(true);
        s3.setOnboardComputerSystem("ARM Cortex");
        s3.setNavigationSystem("LIDAR");
        s3.setSubmersible(true);
        s3.setBatteryLife(12.0);
        s3.setHasPeriscope(true);
        s3.setCombatSystem("Kalibr");
        s3.setAutonomous(true);
        s3.setNumberOfEscapePods(3);
        s3.setPaintType("Reflective");
        s3.setRefitSchedule("Every 6 years");
        s3.setHasAntiSubmarineWarfare(true);
        s3.setThermalSignature("High");
        s3.setHasNuclearMissiles(true);

        Submarine[] submarines =new Submarine[3];
        submarines[0]=s1;
        submarines[1]=s2;
        submarines[3]=s3;
       
        for (Submarine submarine : submarines) {
            submarine.display();
        }
    

	


		
		
		
	}

}
