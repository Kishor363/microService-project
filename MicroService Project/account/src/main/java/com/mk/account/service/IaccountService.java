package com.mk.account.service;

import java.util.List;
import java.util.Optional;

import com.mk.account.exception.AccountDetailsError;
import com.mk.account.model.Account;

public interface IaccountService {
	
	public String addMoney(Account account);
	
	public String withdrawMoney(int accNo,Double amount) throws AccountDetailsError;
	
	public List<Account> getAccount();
	
	public Optional<Account> getAccByNo(int number);

}
