package com.xworkz.bike;
import com.xworkz.bikestore.Bike;
import com.xworkz.bikestore.City;
import com.xworkz.bikestore.Sweet;
import com.xworkz.bikestore.River;
import com.xworkz.bikestore.Dam;
public class BikeRunner {

	public static void main(String[] args) {
		Bike bike=new Bike();
		
		bike.save("Pulsar");
		bike.save("Apache");
		bike.save("Royal Enfield");
		bike.save("Honda");
		bike.save("Dio");
		bike.save("Himalayan");
		bike.save("RX100");
		bike.showNames();
		System.out.println("===============================================");
		
		
		Sweet sweet=new Sweet();
		
		sweet.save("Pedha");
		sweet.save("mysore pak");
		sweet.save("jelabi");
		sweet.save("rasmali");
		sweet.save("rabadi");
		sweet.save("kalkanda");
		sweet.save("milk kova");
		sweet.ShowNames();
		System.out.println("===============================================");
		
		City city=new City();
		
		
		city.save("Banglore");
		city.save("Dubai");
		city.save("Mumbai");
		city.save("Kolkata");
		city.save("Hubli");
		city.save("Haveri");
		city.save("Ranebennur");
		city.ShowNames();
		System.out.println("===============================================");
		
		River river=new River();
		river.ShowNames();
		river.save("Tunga");
		river.save("Badhra");
		river.save("Yamuna");
		river.save("Kali");
		river.save("Tapti");
		river.save("Ganga");
		river.save("Kaveri");
		river.ShowNames();
		System.out.println("===============================================");
		
		Dam dam=new Dam();
		
		dam.save("Sardar Sarovar Dam");
		dam.save("Nagarjuna Sagar Dam");
		dam.save("Hirakud dam");
		dam.save("Bhakra Nangal Dam");
		dam.save("Idukki Arch Dam");
		dam.save("Srisailam Dam");
		dam.save("Tehri Dam. ..");
		dam.ShowNames();
		
		
		
		
	}

}
