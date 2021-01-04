package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.bankAssignment7.models.AccountHolder;

public interface AccountHolderRepo extends JpaRepository<AccountHolder, Long> {

}