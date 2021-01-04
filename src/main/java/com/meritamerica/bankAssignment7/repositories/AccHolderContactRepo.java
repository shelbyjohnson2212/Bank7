package com.meritamerica.bankAssignment7.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.meritamerica.bankAssignment7.models.AccountHolderContact;

@RepositoryRestResource(path = "contacts",collectionResourceRel="contacts")
public interface AccHolderContactRepo extends CrudRepository<AccountHolderContact, Long> {
	
}