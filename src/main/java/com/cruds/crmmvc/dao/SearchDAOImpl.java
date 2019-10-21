package com.cruds.crmmvc.dao;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cruds.crmmvc.model.Customer;
@Repository("searchdao")
@Transactional
public class SearchDAOImpl extends AbstractDao<Integer, Customer> implements SearchDAO{

	@Override
	public Customer findCustomer(long mobile) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("mobile", mobile));
		return (Customer) criteria.uniqueResult();
	}

}
