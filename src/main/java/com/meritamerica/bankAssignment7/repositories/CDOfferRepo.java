package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meritamerica.bankAssignment7.models.CDOffering;

public interface CDOfferRepo extends JpaRepository<CDOffering, Long> {
	
}