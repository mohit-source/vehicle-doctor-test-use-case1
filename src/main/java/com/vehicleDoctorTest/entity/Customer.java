package com.vehicleDoctorTest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="password")
	private String password;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString() {
		return "Customer Detail :-\n"+"Name :-"+this.name+", \nAddress :" +this.address+", \nPhone Number :"+this.phoneNumber+", \nEmail ID:"+this.emailId;
	}
	
}
