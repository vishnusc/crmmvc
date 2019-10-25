package com.cruds.crmmvc.dao;

import com.cruds.crmmvc.model.Customer;

public interface CustomerDAO {
	
	boolean addCustomer(Customer customer);
	
	boolean updateCustomer(Customer customer);

}
