package com.mk.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.customer.model.CustomerDetails;
import com.mk.customer.service.IcustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private IcustomerService custService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody CustomerDetails cust){
		String msg=custService.addCustomer(cust);
		return ResponseEntity .ok(msg);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CustomerDetails>> showAllCustomer(){
		List<CustomerDetails> custList=custService.findAllCustomer();
		return ResponseEntity.ok(custList);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Optional<CustomerDetails>> getCustById(@PathVariable Integer id){
		Optional<CustomerDetails> custDetails=custService.getCustomerById(id);
		return  ResponseEntity.ok(custDetails);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer(@RequestBody CustomerDetails cust){
		String msg=custService.editCustomer(cust);
		return ResponseEntity .ok(msg);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id){
		String msg=custService.deleteCustomer(id);
		return ResponseEntity.ok(msg);
	}

}
