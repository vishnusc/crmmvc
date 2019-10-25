package com.cruds.crmmvc.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cruds.crmmvc.model.Customer;

@Repository("customerdao")
@Transactional
public class CustomerDAOImpl extends AbstractDao<Integer, Customer> implements CustomerDAO {

	@Override
	public boolean addCustomer(Customer customer) {
		persist(customer);
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		update(customer);
		return true;
	}

}
