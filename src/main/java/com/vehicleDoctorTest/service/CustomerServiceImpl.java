package com.vehicleDoctorTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleDoctorTest.entity.Customer;
import com.vehicleDoctorTest.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository custRepo;
	Customer cust = new Customer();
	
	@Override
	public void save(Customer cust) {
		custRepo.save(cust);
		System.out.println("\nCustomer has been registered successfully !!! \n"+cust.toString());
	}
	
	@Override
	public String update(Customer cust) {
		if(custRepo.existsById(cust.getId())) {
			custRepo.save(cust);
			return "\nCustomer's details has been update successfully !!! \n"+cust.toString();
		} else {
			return "\nInvalid customer details !!! ";
		}
		
	}
	
	@Override
	public Iterable<Customer> list() {
		return custRepo.findAll();		
	}
	
	@Override
	public String login(Customer cust) {
		
		Customer c = custRepo.findByEmailId(cust.getEmailId());
		if(c==null) {
			return "\nUser not found, Please Register yourself first !!!";
		} else {
			if(cust.getEmailId().equals(c.getEmailId()) && cust.getPassword().equals(c.getPassword())) {
				return "\nHello "+c.getName()+ ", You are Succesfully Logged in !!!";
			} else {
				return "\nInvalid Email Id and Password, Please enter valid credentials !!!";
			}
		}
		
		

	}

	
}
