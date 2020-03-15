package com.account.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
	@Table(name = "acc")
	public class Account {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long accountNumber;
		private String isfc;
		private double balance;
		private boolean active;
		private AccountType account;
		
		

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		public Long getAccountNumber() {
			return accountNumber;
		}
		

		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public AccountType getAccount() {
			return account;
		}

		public void setAccount(AccountType account) {
			this.account = account;
		}

		public String getIsfc() {
			return isfc;
		}

		public void setIsfc(String isfc) {
			this.isfc = isfc;
		}

		public Account(String isfc, double balance, boolean active, AccountType account) {

			this.isfc = isfc;
			this.balance = balance;
			this.active = active;
			this.account = account;
		}

		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", isfc=" + isfc + ", balance=" + balance + ", active="
					+ active + ", account=" + account + "]";
		}

	}
