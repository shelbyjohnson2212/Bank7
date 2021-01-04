package com.meritamerica.bankAssignment7.models;

import java.util.Date;

import com.meritamerica.bankAssignment7.models.BankAccount;
import com.meritamerica.bankAssignment7.models.Transaction;

public class DepositTransaction extends Transaction {
	DepositTransaction(BankAccount targetAccount, double amount, Date date) {
		super(targetAccount, amount, date);
	}	
}