package com.mk.customer.service;

import java.util.List;
import java.util.Optional;

import com.mk.customer.model.CustomerDetails;

public interface IcustomerService {
	
	public String addCustomer(CustomerDetails cust);
	
	public List<CustomerDetails> findAllCustomer();
	
	public Optional<CustomerDetails> getCustomerById(int id);
	
	public String editCustomer(CustomerDetails cust);
	
	public String deleteCustomer(int id);

}
