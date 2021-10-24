package com.vehicleDoctorTest.service;

import com.vehicleDoctorTest.entity.Customer;

public interface CustomerService {
	public void save(Customer cust);
	public String update(Customer cust);
	public Iterable<Customer> list();
	public String login(Customer cust); 
}
