package com.vehicleDoctorTest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleDoctorTest.entity.Customer;

import com.vehicleDoctorTest.service.CustomerServiceImpl;


@RestController
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerService;
	Customer cust = new Customer();
	
	@PostMapping("/customer")
	public void save(@RequestBody Customer cust) {
		customerService.save(cust);
	}
	
	@PutMapping("/customer")
	public String update(@RequestBody Customer cust) {
		return customerService.update(cust);
	}
	
	@GetMapping("/customer")
	public Iterable<Customer> list() {
		return customerService.list();		
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Customer cust) {	
		return customerService.login(cust);		
	}
}
