package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.bankAssignment7.models.CDAccount;

public interface CDAccountRepo extends JpaRepository<CDAccount, Long> {

}
