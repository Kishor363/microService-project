package com.mk.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.account.exception.AccountDetailsError;
import com.mk.account.model.Account;
import com.mk.account.repo.IaccountDetailRepo;


@Service
public class AccountServiceImpl implements IaccountService {
	
	@Autowired
	private IaccountDetailRepo accRepo;

	@Override
	public String addMoney(Account account) {
		accRepo.save(account);
		return "Account saved with account no :- "+account.getAccountNo();
	}

	@Override
	public String withdrawMoney(int accNo, Double amount) throws AccountDetailsError {
		Optional<Account> acc=accRepo.findById(accNo);
		if((acc.get().getMoney())<=0) {
			throw new AccountDetailsError("account has insufficeant balance");
		}else {
			Double amt=(acc.get().getMoney()-amount);
			acc.get().setMoney(amt);
			accRepo.save(acc.get())	;		
		}
		
		
		return "money withdraw from account" +amount + "available balance is :- "+acc.get().getMoney();
	}

	@Override
	public List<Account> getAccount() {
		List<Account> accList=accRepo.findAll();
		return accList;
	}

	@Override
	public Optional<Account> getAccByNo(int number) {
		Optional<Account> findById=accRepo.findById(number);
		return findById;
	}

}
