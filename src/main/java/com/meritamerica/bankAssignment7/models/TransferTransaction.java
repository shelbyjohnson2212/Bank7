package com.meritamerica.bankAssignment7.models;

import java.util.Date;

import com.meritamerica.bankAssignment7.models.BankAccount;
import com.meritamerica.bankAssignment7.models.Transaction;

public class TransferTransaction extends Transaction {
	TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date date) {
		super(sourceAccount, targetAccount, amount, date);
	}
}