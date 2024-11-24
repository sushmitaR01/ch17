package com.xworkz.order.service;

import com.xworkz.order.dto.OrderDTO;

public interface OrderService {
	boolean save(OrderDTO dto);
    boolean getListOfDataById(String data);
    boolean getNameAndEmailById(String name,String email);
    boolean ifEmailAndPasswordSameByData(OrderDTO dto);

}
