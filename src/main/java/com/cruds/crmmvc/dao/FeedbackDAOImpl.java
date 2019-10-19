package com.cruds.crmmvc.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cruds.crmmvc.model.Feedback;

@Repository("feedbackdao")
@Transactional
public class FeedbackDAOImpl extends AbstractDao<Integer, Feedback> implements FeedbackDAO  {

	@Override
	public boolean addFeedback(Feedback feedback) {
		persist(feedback);
		return true;
	}

}
