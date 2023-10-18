package com.mk.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.customer.model.CustomerDetails;
import com.mk.customer.repo.IcustomerRepo;

@Service
public class CustomerServiceImpl implements IcustomerService {
	
	@Autowired
	private IcustomerRepo custRepo;

	@Override
	public String addCustomer(CustomerDetails cust) {
		custRepo.save(cust);
		return "Customer saved with id number :- "+cust.getCustId();
	}

	@Override
	public List<CustomerDetails> findAllCustomer() {
		List<CustomerDetails> custList=custRepo.findAll();
		return custList;
	}

	@Override
	public Optional<CustomerDetails> getCustomerById(int id) {
		Optional<CustomerDetails >custdetail=custRepo.findById(id);
		return custdetail;
	}

	@Override
	public String editCustomer(CustomerDetails cust) {
		custRepo.save(cust);
		return "Customer updated with id :- " +cust.getCustId();
	}

	@Override
	public String deleteCustomer(int id) {
		custRepo.deleteById(id);
		return "Customer deleted with id :- "+id ;
	}

}
