package com.cruds.crmmvc.services;

import com.cruds.crmmvc.model.Customer;
import com.cruds.crmmvc.model.Feedback;
import com.cruds.crmmvc.model.Points;

public interface CrmService {
	
	boolean addCustomer(Customer customer);
	
	boolean addFeedback(Feedback feedback);

	Customer findCustomer(long mobile);
	
	boolean updateCustomer(Customer customer);
	
	boolean addPoints(Points points);
}
