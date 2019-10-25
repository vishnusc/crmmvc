package com.cruds.crmmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="points")
public class Points {

	@Id
	@GeneratedValue
	@Column(name = "points_id")
	private int id;
	
	@Column(name = "points_tpoint")
	private float tpoint;
	
	@ManyToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id")
	Customer customer;

	
	
	public Points() {
	
	}



	public Points(float tpoint, Customer customer) {
		this.tpoint = tpoint;
		this.customer = customer;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public float getTpoint() {
		return tpoint;
	}



	public void setTpoint(float tpoint) {
		this.tpoint = tpoint;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	@Override
	public String toString() {
		return "Points [id=" + id + ", tpoint=" + tpoint + ", customer=" + customer + "]";
	}
	
	
	
}
