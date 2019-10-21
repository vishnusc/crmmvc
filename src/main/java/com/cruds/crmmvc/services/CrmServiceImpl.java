package com.cruds.crmmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cruds.crmmvc.dao.CustomerDAO;
import com.cruds.crmmvc.dao.FeedbackDAO;
import com.cruds.crmmvc.dao.SearchDAO;
import com.cruds.crmmvc.model.Customer;
import com.cruds.crmmvc.model.Feedback;

@Service("crmservice")
@Transactional
public class CrmServiceImpl implements CrmService {

	@Autowired
	CustomerDAO cdao;
	
	@Autowired
	FeedbackDAO fdao;
	
	@Autowired
	SearchDAO sdao;
	
	@Override
	public boolean addCustomer(Customer customer) {

		cdao.addCustomer(customer);
		return true;
	}

	@Override
	public boolean addFeedback(Feedback feedback) {
		
		fdao.addFeedback(feedback);
		return true;
	}

	@Override
	public Customer findCustomer(long mno) {
		return sdao.findCustomer(mno);
	}

}
