package com.cruds.crmmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue
	@Column(name = "feedback_id")
	private int id;
	
	@Column(name = "feedback_q1")
	private String q1;
	
	@Column(name = "feedback_q2")
	private String q2;
	
	@Column(name = "feedback_r1_food")
	private String rFood;
	
	@Column(name = "feedback_r2_music")
	private String rMusic;
	
	@Column(name = "customer_sugg")
	@Lob
	private String suggestion;

	public Feedback() {
		
	}

	public Feedback(String q1, String q2, String rFood, String rMusic, String suggestion) {
		super();
		this.q1 = q1;
		this.q2 = q2;
		this.rFood = rFood;
		this.rMusic = rMusic;
		this.suggestion = suggestion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getrFood() {
		return rFood;
	}

	public void setrFood(String rFood) {
		this.rFood = rFood;
	}

	public String getrMusic() {
		return rMusic;
	}

	public void setrMusic(String rMusic) {
		this.rMusic = rMusic;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", q1=" + q1 + ", q2=" + q2 + ", rFood=" + rFood + ", rMusic=" + rMusic
				+ ", suggestion=" + suggestion + "]";
	}
	
	
	
	
}
