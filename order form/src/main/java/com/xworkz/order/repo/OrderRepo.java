package com.xworkz.order.repo;

import com.xworkz.order.dto.OrderDTO;

public interface OrderRepo {

    static boolean save(OrderDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
    static boolean getListOfDataById(String data) {
		// TODO Auto-generated method stub
		return false;
	}
    static boolean getNameAndEmailById(String name,String email) {
		// TODO Auto-generated method stub
		return false;
	}
    boolean ifEmailAndPasswordSameByData(OrderDTO dto);

}
