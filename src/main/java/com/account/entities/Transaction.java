package com.account.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private LocalDateTime time;
	private Long fromAccount;
	private Long toAccount;
	private double transactionAmount;
	private String status;
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Transaction( Long fromAccount, Long toAccount, double transactionAmount, String status) {
		super();
		this.time = LocalDateTime.now();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionAmount = transactionAmount;
		this.status = status;
	}
	public Transaction() {
		
	}
	/*@Override
	public String toString() {
		return "Transaction [time=" + time + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", transactionAmount=" + transactionAmount + ", status=" + status + "]";
	}*/
	
	

}