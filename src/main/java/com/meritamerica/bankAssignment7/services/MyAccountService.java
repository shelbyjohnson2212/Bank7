package com.meritamerica.bankAssignment7.services;

import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meritamerica.bankAssignment7.exceptions.ExceedsCombinedBalanceLimitException;
import com.meritamerica.bankAssignment7.models.AccountHolder;
import com.meritamerica.bankAssignment7.models.CDAccount;
import com.meritamerica.bankAssignment7.models.CheckingAccount;
import com.meritamerica.bankAssignment7.models.SavingsAccount;
import com.meritamerica.bankAssignment7.repositories.CDAccountRepo;
import com.meritamerica.bankAssignment7.repositories.CDOfferRepo;
import com.meritamerica.bankAssignment7.repositories.CheckingAccountRepo;
import com.meritamerica.bankAssignment7.repositories.MyUserRepo;
import com.meritamerica.bankAssignment7.repositories.SavingAccountRepo;
import com.meritamerica.bankAssignment7.security.Users;

@Service
public class MyAccountService {
	@Autowired
	MyUserRepo userRepo;
	
	@Autowired
	CheckingAccountRepo checkingRepo;
	
	@Autowired
	SavingAccountRepo savingRepo;
	
	@Autowired
	CDAccountRepo cdaccRepo;
	
	@Autowired
	CDOfferRepo cdofferingRepo;
	
	public Users getUser(String username) {
		return userRepo.findByUserName(username);
	}
	
	public AccountHolder getMyAccountHolder(Principal principal) {
		Users user = userRepo.findByUserName(principal.getName());
		AccountHolder acc = user.getAccountHolder();
		return acc;
	}
	
	public CheckingAccount addChecking(CheckingAccount checking,Principal principal) throws ExceedsCombinedBalanceLimitException {
		AccountHolder acc = getMyAccountHolder(principal);
		checking.setAccHolder(acc);
		checking = checkingRepo.save(checking);
		return checking;
	}
	
	public List<CheckingAccount> getCheckings(Principal principal) {
		AccountHolder acc = getMyAccountHolder(principal);
		return acc.getCheckingAccounts();
	}
	
	public SavingsAccount addSaving(SavingsAccount saving,Principal principal) throws ExceedsCombinedBalanceLimitException {
		AccountHolder acc = getMyAccountHolder(principal);
		saving.setAccHolder(acc);
		saving = savingRepo.save(saving);
		return saving;
	}
	
	public List<SavingsAccount> getSavings(Principal principal) {
		AccountHolder acc = getMyAccountHolder(principal);
		return acc.getSavingsAccounts();
	}
	
	public CDAccount addCDAccount(CDAccount cda,Principal principal) throws ExceedsCombinedBalanceLimitException {
		AccountHolder acc = getMyAccountHolder(principal);
		cda.setAccHolder(acc);
		cda = cdaccRepo.save(cda);
		return cda;
	}
	
	public List<CDAccount> getCDAccount(Principal principal) throws ExceedsCombinedBalanceLimitException {
		AccountHolder acc = getMyAccountHolder(principal);
		return acc.getCDAccounts();
	}	