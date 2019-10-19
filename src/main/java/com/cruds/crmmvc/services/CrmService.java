package com.cruds.crmmvc.services;

import com.cruds.crmmvc.model.Customer;
import com.cruds.crmmvc.model.Feedback;

public interface CrmService {
	
	boolean addCustomer(Customer customer);
	
	boolean addFeedback(Feedback feedback);

}
