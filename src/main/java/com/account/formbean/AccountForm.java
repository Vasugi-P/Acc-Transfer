package com.account.formbean;

import com.account.entities.AccountType;

public class AccountForm {
	
	private String isfc;
	private double balance;
	private boolean active;
	private AccountType account;
	public String getIsfc() {
		return isfc;
	}
	public void setIsfc(String isfc) {
		this.isfc = isfc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public AccountType getAccount() {
		return account;
	}
	public void setAccount(AccountType account) {
		this.account = account;
	}
	
	

}
