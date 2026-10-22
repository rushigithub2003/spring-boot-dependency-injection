package com.example.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.di.entity.Customer;
import com.example.di.repository.CustomerRepo;

public class PremiumCustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo cr;

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

}
