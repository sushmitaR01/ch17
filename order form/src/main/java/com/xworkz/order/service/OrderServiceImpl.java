package com.xworkz.order.service;

import com.xworkz.order.dto.OrderDTO;
import com.xworkz.order.repo.OrderRepo;
import com.xworkz.order.repo.OrderRepoImpl;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean save(OrderDTO dto) {
		boolean isValid = true;
		System.out.println("id:" + dto.getId());
		System.out.println("name:" + dto.getName());
		System.out.println("email:" + dto.getEmail());
		System.out.println("phoneNo:" + dto.getPhoneNo());
		System.out.println("password:" + dto.getPassword());

		OrderRepoImpl orderRepoImpl = new OrderRepoImpl();
		OrderRepo.save(dto);
		return isValid;

	}

	@Override
	public boolean getListOfDataById(String data) {
		boolean isValid = true;
		if (data != null) {
			System.out.println("data is matched");
		} else {
			System.err.println("data is not matched");
		}

		OrderRepoImpl orderRepoImpl = new OrderRepoImpl();
		OrderRepo.getListOfDataById(data);
		return isValid;
	}

	@Override
	public boolean getNameAndEmailById(String name, String email) {
		boolean isValid = true;
		if (name != null) {
			System.out.println("data is matched");
		} else {
			System.err.println("data is not matched");
		}
		return isValid;
	}

	@Override
	public boolean ifEmailAndPasswordSameByData(OrderDTO dto) {
		  Object email = null;
		  boolean isValid=true;
		if(email!=null){
	            System.out.println("data is matched");
	        }else {
	            System.err.println("data is not matched");
	        }
	    
	        OrderRepoImpl OrderRepo=new OrderRepoImpl();
	        OrderRepo.ifEmailAndPasswordSameByData(dto);
	        return isValid;

}
}
