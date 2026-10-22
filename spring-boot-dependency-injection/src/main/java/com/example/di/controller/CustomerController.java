package com.example.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.di.entity.Customer;
import com.example.di.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	@Qualifier("customerServiceImpl")
	CustomerService cs;

	@Autowired
	@Qualifier("premiumCustomerServiceImpl")
	CustomerService pcs;

	@PostMapping("customer")
	String addCustomer(@RequestBody Customer c) {

		if (c.getType().equals("customerServiceImpl"))
			cs.addCustomer(c);
		if (c.getType().equals("premiumCustomerServiceImpl"))
			pcs.addCustomer(c);

		return "Customer Added";
	}

}
