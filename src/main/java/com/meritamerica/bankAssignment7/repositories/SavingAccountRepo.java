package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meritamerica.bankAssignment7.models.SavingsAccount;

public interface SavingAccountRepo extends JpaRepository<SavingsAccount, Long> {

}