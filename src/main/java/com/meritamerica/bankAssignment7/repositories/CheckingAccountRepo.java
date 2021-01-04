package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meritamerica.bankAssignment7.models.CheckingAccount;

public interface CheckingAccountRepo extends JpaRepository<CheckingAccount, Long> {
	
}