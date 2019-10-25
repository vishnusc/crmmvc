package com.cruds.crmmvc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="visits")
public class Visits {

	
	@Id
	@GeneratedValue
	@Column(name = "visits_id")
	private int id;
	
	
	@Column(name = "visits_date")
	private Date vdate;
	

	@Column(name = "visits_aSpent")
	private float aspent;
	
	@ManyToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id")
	Customer customer;

	public Visits() {
	}

	public Visits(Date vdate, float aspent, Customer customer) {
		super();
		this.vdate = vdate;
		this.aspent = aspent;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getVdate() {
		return vdate;
	}

	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}

	public float getAspent() {
		return aspent;
	}

	public void setAspent(float aspent) {
		this.aspent = aspent;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Visits [id=" + id + ", vdate=" + vdate + ", aspent=" + aspent + ", customer=" + customer + "]";
	}
	
	
	
}
