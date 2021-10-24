package com.vehicleDoctorTest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleDoctorTest.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	Customer findByEmailId(String emailId);
}
