package com.cruds.crmmvc.dao;


import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cruds.crmmvc.model.Points;

@Repository("pointsdao")
@Transactional
public class PointsDAOImpl extends AbstractDao<Integer, Points> implements PointsDAO{

	@Override
	public boolean addPoints(Points points) {
		persist(points);
		return true;
	}

}
