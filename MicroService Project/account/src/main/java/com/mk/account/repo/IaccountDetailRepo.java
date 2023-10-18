package com.mk.account.repo;


import org.springframework.data.jpa.repository.JpaRepository;


import com.mk.account.model.Account;

public interface IaccountDetailRepo extends JpaRepository<Account, Integer> {
	

}
