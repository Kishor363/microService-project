package com.mk.account.client;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mk.account.model.CustomerDetails;

@FeignClient("Custumer-Service")
public interface CustomerClient {
	
	@GetMapping("/customer/findById/{id}")
	public Optional<CustomerDetails> getCustById(@PathVariable Integer id);

}
