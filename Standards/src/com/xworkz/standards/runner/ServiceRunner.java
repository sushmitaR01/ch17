package com.xworkz.standards.runner;

import com.xworkz.standards.repository.AddressRepository;
import com.xworkz.standards.repository.AddressRepositoryimpl;
import com.xworkz.standards.repository.MachineRepository;
import com.xworkz.standards.repository.MachineRepositoryImpl;
import com.xworkz.standards.repository.Repository;
import com.xworkz.standards.repository.RepositoryImpl;
import com.xworkz.standards.repository.VehicleRepository;
import com.xworkz.standards.repository.VehicleRepositoryimpl;
import com.xworkz.standards.service.AddressService;
import com.xworkz.standards.service.AddressServiceimpl;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImpl;
import com.xworkz.standards.service.Service;
import com.xworkz.standards.service.ServiceImpl;
import com.xworkz.standards.service.VehicleService;
import com.xworkz.standards.service.VehicleServiceimpl;

public class ServiceRunner {

	public static void main(String[] args) {
		Repository repository = new RepositoryImpl();
		Service service = new ServiceImpl(repository);
		String msg = service.push();
		System.out.println("push return:" + msg);

		System.out.println("=================================");

		AddressRepository addressRepository = new AddressRepositoryimpl();

		AddressService addressService = new AddressServiceimpl(addressRepository);
		String msg1 = addressService.push();
		System.out.println("Service adress is:" + msg1);

		String Stringmsg = addressService.refresh();
		System.out.println("Service adress is:" + Stringmsg);

		String stringmsg = addressService.remove();
		System.out.println("Service adress is:" + stringmsg);

		String stringmsg1 = addressService.load();
		System.out.println("Service adress is:" + stringmsg1);

		System.out.println("=================================");

		VehicleRepository vehicleRepository = new VehicleRepositoryimpl();
		VehicleService vehicleService = new VehicleServiceimpl(vehicleRepository);
		String stringmsg2 = vehicleService.persist();
		System.out.println("vehicleService persist is:" + stringmsg2);

		String stringmsg3 = vehicleService.merge();
		System.out.println("vehicleService merge is:" + stringmsg3);

		String stringmsg4 = vehicleService.clear();
		System.out.println("vehicleService clear is:" + stringmsg4);

		String stringmsg5 = vehicleService.search();
		System.out.println("vehicleService search is:" + stringmsg5);

		System.out.println("=================================");

		MachineRepository machineRepository = new MachineRepositoryImpl();
		MachineService machineService = new MachineServiceImpl(machineRepository);
		String str1 = machineService.save();
		System.out.println("machineService save is:" + str1);

		String str2 = machineService.update();
		System.out.println("machineService save is:" + str2);

		String str3 = machineService.delete();
		System.out.println("machineService save is:" + str3);

		String str4 = machineService.save();
		System.out.println("machineService save is:" + str4);

	}

}
