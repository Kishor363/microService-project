package com.mk.account.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.account.client.CustomerClient;
import com.mk.account.exception.AccountDetailsError;
import com.mk.account.model.Account;
import com.mk.account.model.CustomerDetails;
import com.mk.account.service.IaccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private IaccountService accServ;
	
	@Autowired
	private CustomerClient client;
	
	@PostMapping("/add")
	public ResponseEntity<String> addAccount(@RequestBody Account account){
		String msg=accServ.addMoney(account);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Account>> getAllAccount(){
		List<Account> allAcc=accServ.getAccount();
		return ResponseEntity.ok(allAcc);
	}
	
	@GetMapping("/getBy/{id}")
	public ResponseEntity<Optional<Account>> getAllAccount(@PathVariable int id){
		Optional<CustomerDetails> custClient=client.getCustById(id);
		//System.out.println(custClient.get().getFirstName());
		Optional<Account> accById=accServ.getAccByNo(id);
		accById.get().setCustDetails(custClient.get());
		return ResponseEntity.ok(accById);
	}
	
	@PutMapping("/withdraw/{no}/{amount}")
	public ResponseEntity<String> withdraw(@PathVariable int no,@PathVariable Double amount) throws AccountDetailsError{
		String msg=accServ.withdrawMoney(no, amount);
		return ResponseEntity.ok(msg);
	}
	
	
	
	

}
