package com.mk.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.customer.model.CustomerDetails;

public interface IcustomerRepo extends JpaRepository<CustomerDetails, Integer> {

}
