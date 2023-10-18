package com.mk.account.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer accountNo;
	private Integer customerId;
	private CustomerDetails custDetails;
	private Double money;
	
	public CustomerDetails getCustDetails() {
		return custDetails;
	}
	public void setCustDetails(CustomerDetails custDetails) {
		this.custDetails = custDetails;
	}
	
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	

}
