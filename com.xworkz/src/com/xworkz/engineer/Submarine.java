package com.xworkz.engineer;

public class Submarine {
	
	
	private String name;
    private String type;
    private double length;
    private double width;
    private double height;
    private String propulsionType;
    private int crewCapacity;
    private double maxDepth;
    private double displacement;
    private int yearCommissioned;
    private String countryOfOrigin;
    private boolean isNuclearPowered;
    private double speed;
    private String armament;
    private boolean isStealthCapable;
    private String sonarType;
    private String communicationSystem;
    private double endurance;
    private String hullMaterial;
    private String operatingDepth;
    private String radarType;
    private boolean hasTorpedoSystem;
    private int numberOfMissiles;
    private boolean hasMineLayingCapability;
    private String electronicWarfareSystem;
    private double lengthOfService;
    private boolean hasRescueSystem;
    private String onboardComputerSystem;
    private String navigationSystem;
    private boolean isSubmersible;
    private double batteryLife;
    private boolean hasPeriscope;
    private String combatSystem;
    private boolean isAutonomous;
    private int numberOfEscapePods;
    private String paintType;
    private String refitSchedule;
    private boolean hasAntiSubmarineWarfare;
    private String thermalSignature;
    private boolean hasNuclearMissiles;
    public Submarine(String name, String type, double length, double width, double height) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

   
    public void setPropulsionType(String propulsionType) 
    { 
    	this.propulsionType = propulsionType;
    }
    public void setCrewCapacity(int crewCapacity) 
    { 
    	this.crewCapacity = crewCapacity; 
    }
    public void setMaxDepth(double maxDepth) 
    { 
    	this.maxDepth = maxDepth;
    }
    public void setDisplacement(double displacement) 
    { 
    	this.displacement = displacement; 
    }
    public void setYearCommissioned(int yearCommissioned) 
    { 
    	this.yearCommissioned = yearCommissioned; 
    }
    public void setCountryOfOrigin(String countryOfOrigin)
    { 
    	this.countryOfOrigin = countryOfOrigin; 
    }
    public void setNuclearPowered(boolean isNuclearPowered) 
    { 
    	this.isNuclearPowered = isNuclearPowered; 
    }
    public void setSpeed(double speed) 
    { 
    	this.speed = speed; 
    }
    public void setArmament(String armament) 
    { 
    	this.armament = armament;
    }
    public void setStealthCapable(boolean isStealthCapable)
    { 
    	this.isStealthCapable = isStealthCapable; 
    }
    public void setSonarType(String sonarType) 
    {
    	this.sonarType = sonarType; 
    }
    public void setCommunicationSystem(String communicationSystem) 
    { 
    	this.communicationSystem = communicationSystem; 
    }
    public void setEndurance(double endurance) 
    { 
    	this.endurance = endurance; }
    public void setHullMaterial(String hullMaterial)
    { 
    	this.hullMaterial = hullMaterial;
    }
    public void setOperatingDepth(String operatingDepth) 
    { 
    	this.operatingDepth = operatingDepth; 
    }
    public void setRadarType(String radarType) 
    { 
    	this.radarType = radarType; 
    }
    public void setHasTorpedoSystem(boolean hasTorpedoSystem) 
    { 
    	this.hasTorpedoSystem = hasTorpedoSystem; 
    }
    public void setNumberOfMissiles(int numberOfMissiles) 
    {
    	this.numberOfMissiles = numberOfMissiles; 
    }
    public void setHasMineLayingCapability(boolean hasMineLayingCapability) 
    { 
    	this.hasMineLayingCapability = hasMineLayingCapability; 
    }
    public void setElectronicWarfareSystem(String electronicWarfareSystem)
    { 
    	this.electronicWarfareSystem = electronicWarfareSystem; 
    }
    public void setLengthOfService(double lengthOfService)
    {
    	this.lengthOfService = lengthOfService;
    }
    public void setHasRescueSystem(boolean hasRescueSystem) 
    { 
    	this.hasRescueSystem = hasRescueSystem; 
    }
    public void setOnboardComputerSystem(String onboardComputerSystem) 
    { 
    	this.onboardComputerSystem = onboardComputerSystem;
    }
    public void setNavigationSystem(String navigationSystem) 
    { 
    	this.navigationSystem = navigationSystem; 
    }
    public void setSubmersible(boolean isSubmersible) 
    { 
    	this.isSubmersible = isSubmersible; 
    }
    public void setBatteryLife(double batteryLife)
    { 
    	this.batteryLife = batteryLife; 
    }
    public void setHasPeriscope(boolean hasPeriscope)
    { 
    	this.hasPeriscope = hasPeriscope; 
    }
    public void setCombatSystem(String combatSystem)
    { 
    	this.combatSystem = combatSystem; 
    }
    public void setAutonomous(boolean isAutonomous) 
    { 
    	this.isAutonomous = isAutonomous; 
    }
    public void setNumberOfEscapePods(int numberOfEscapePods)
    {
    	this.numberOfEscapePods = numberOfEscapePods;
    }
    public void setPaintType(String paintType) 
    { 
    	this.paintType = paintType;
    }
    public void setRefitSchedule(String refitSchedule) 
    {
    	this.refitSchedule = refitSchedule;
    }
    public void setHasAntiSubmarineWarfare(boolean hasAntiSubmarineWarfare)
    { 
    	this.hasAntiSubmarineWarfare = hasAntiSubmarineWarfare;
    }
    public void setThermalSignature(String thermalSignature)
    { 
    	this.thermalSignature = thermalSignature; 
    }
    public void setHasNuclearMissiles(boolean hasNuclearMissiles)
    { 
    	this.hasNuclearMissiles = hasNuclearMissiles; 
    }

   
    public void display() 
    {
        System.out.println("Submarine: " + name);
        System.out.println( type );
        System.out.println(length);
        System.out.println(width );
        System.out.println(height );
        
        System.out.println( propulsionType);
        System.out.println(crewCapacity );
        System.out.println( maxDepth);
        System.out.println( displacement);
        System.out.println( yearCommissioned );
        
        System.out.println( countryOfOrigin);
        System.out.println(isNuclearPowered );
        System.out.println(speed );
        System.out.println( armament);
        System.out.println(isStealthCapable);
        System.out.println(sonarType);
        System.out.println(communicationSystem);
        System.out.println( endurance);
        System.out.println(hullMaterial);
        System.out.println(operatingDepth);
        System.out.println(  radarType);
        System.out.println(hasTorpedoSystem );
        System.out.println(numberOfMissiles);
        System.out.println(hasMineLayingCapability);
        System.out.println( electronicWarfareSystem);
        System.out.println(lengthOfService);
        System.out.println(hasRescueSystem);
        System.out.println(onboardComputerSystem );
     
        System.out.println( navigationSystem );
        System.out.println(isSubmersible);
        System.out.println(batteryLife);
        System.out.println(hasPeriscope );
        System.out.println(combatSystem);
        System.out.println(isAutonomous);
        System.out.println(numberOfEscapePods);
        System.out.println( paintType);
        System.out.println(refitSchedule);
        
        System.out.println( hasAntiSubmarineWarfare);
        System.out.println(thermalSignature);
        System.out.println( hasNuclearMissiles);
    }




}
