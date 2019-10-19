package com.cruds.crmmvc.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private int id;
	
	
	@Column(name = "customer_name")
	private String name;
	

	@Column(name = "customer_mobile", unique=true)
	private long mobile;
	
	@Column(name = "customer_dob")
	private Date dob;
	
	@Column(name = "customer_adate")
	private Date adate;
	
	@Column(name = "customer_email")
	private String email;
	
	@Column(name = "customer_prefence")
	private String prefence;
	
	@Column(name = "customer_address")
	@Lob
	private String address;
	
	@Column(name = "customer_contact_mode")
	private String contactMode;
	

	@Column(name = "customer_vdate")
	private Date vdate;
	
	public Customer() {
	
	}

	public Customer(String name, long mobile, Date dob, Date adate, String email, String prefence, String address,
			String contactMode, Date vdate) {

		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
		this.adate = adate;
		this.email = email;
		this.prefence = prefence;
		this.address = address;
		this.contactMode = contactMode;
		this.vdate = vdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrefence() {
		return prefence;
	}

	public void setPrefence(String prefence) {
		this.prefence = prefence;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactMode() {
		return contactMode;
	}

	public void setContactMode(String contactMode) {
		this.contactMode = contactMode;
	}

	public Date getVdate() {
		return vdate;
	}

	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobile=" + mobile + ", dob=" + dob + ", adate=" + adate
				+ ", email=" + email + ", prefence=" + prefence + ", address=" + address + ", contactMode="
				+ contactMode + ", vdate=" + vdate + "]";
	}

	
	

}
