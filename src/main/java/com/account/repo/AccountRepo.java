package com.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long>{
	
	Account findByAccountNumber(Long accountNumber);

}
