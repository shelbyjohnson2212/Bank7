package com.meritamerica.bankAssignment7.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meritamerica.bankAssignment7.exceptions.FieldErrorException;
import com.meritamerica.bankAssignment7.exceptions.NotFoundException;
import com.meritamerica.bankAssignment7.models.CDOffering;
import com.meritamerica.bankAssignment7.models.MeritBank;
import com.meritamerica.bankAssignment7.repositories.CDOfferRepo;

@Service
public class CDOfferingService {
	@Autowired
	CDOfferRepo cdofferingRepo;
	
	public CDOffering createCDOffering(CDOffering offering) throws FieldErrorException {		
		MeritBank.addCDOffering(offering); 
		offering = cdofferingRepo.save(offering);
		return offering;
	}
	
	public List<CDOffering> getCDOfferings() throws NotFoundException {
	    return cdofferingRepo.findAll();
	}
}