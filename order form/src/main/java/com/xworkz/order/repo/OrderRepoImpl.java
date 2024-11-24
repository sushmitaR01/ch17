package com.xworkz.order.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.order.dto.OrderDTO;
import com.xworkz.order.enums.OrederEnum;

public class OrderRepoImpl implements OrderRepo{

	public boolean save(OrderDTO dto) {
		 boolean ans=true;
	        Connection connection=null;
	        PreparedStatement prst=null;
	        try {
	            connection= DriverManager.getConnection(OrederEnum.URL.getvalue(),OrederEnum.USERNAME.getvalue(),OrederEnum.PASSWORD.getvalue());
	            prst=connection.prepareStatement("insert into order_table value(?,?,?,?,?)");
	            prst.setString(1, String.valueOf(dto.getId()));
	            prst.setString(2,dto.getName());
	            prst.setString(3,dto.getEmail());
	            prst.setString(4, String.valueOf(dto.getPhoneNo()));
	            prst.setString(5,dto.getPassword());
	            int value=prst.executeUpdate();
	            if(value>0){
	                return true;
	            }else {
	                return false;
	            }
	        } catch (SQLException e) {
	           e.printStackTrace();
	        }
	        return ans;
		
	}

	public boolean getListOfDataById(String data) {
		   boolean ifSaved=false;
	        Connection connection=null;
	        PreparedStatement prst=null;
	        try {
	            connection = DriverManager.getConnection(OrederEnum.URL.getvalue(), OrederEnum.USERNAME.getvalue(), OrederEnum.PASSWORD.getvalue());
	            prst = connection.prepareStatement("select list from order_table where id=?");
	            OrderDTO dto = null;
				prst.setString(1, String.valueOf(dto.getId()));
	            ResultSet resultSet=prst.executeQuery();
	            while (resultSet.next()){
	                System.out.println("saved");
	            }
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	        return ifSaved;
		
	}



	public boolean getNameAndEmailById(String name, String email) {
		  boolean ifSaved=false;
	        Connection connection=null;
	        PreparedStatement prst=null;
	        String name1=null;
	        String email1=null;
	        try {
	            connection = DriverManager.getConnection(OrederEnum.URL.getvalue(), OrederEnum.USERNAME.getvalue(), OrederEnum.PASSWORD.getvalue());
	            prst = connection.prepareStatement("select name and email from order_table where id=?");
	            String id = null;
				prst.setString(1, id);
	            ResultSet set = prst.executeQuery();
	            while (set.next()) {
	                System.out.println("saved");
	                return true;
	            }
	            return ifSaved;
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
			return ifSaved;
	}

	@Override
	public boolean ifEmailAndPasswordSameByData(OrderDTO dto) {
		 boolean ifSaved=false;
         Connection connection=null;
         PreparedStatement prst=null;
         try {
             connection = DriverManager.getConnection(OrederEnum.URL.getvalue(), OrederEnum.USERNAME.getvalue(), OrederEnum.PASSWORD.getvalue());
             prst = connection.prepareStatement("select email and password from order_table where data=? ");
             prst.setString(1,dto.getEmail());
             prst.setString(2,dto.getPassword());
             ResultSet set = prst.executeQuery();
             while (set.next()) {
                 System.out.println("saved");
                 return true;
             }

         }catch (SQLException e){
             e.printStackTrace();
         }
     
     return ifSaved;
		
	}

}
