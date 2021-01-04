package com.meritamerica.bankAssignment7.models;

import java.util.LinkedList;

import com.meritamerica.bankAssignment7.models.Transaction;

public class FraudQueue{
	private LinkedList<Transaction> transactions;
	
	public FraudQueue() {
		transactions = new LinkedList<>();
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.push(transaction);
	}
	
	public Transaction getTransaction() {
		return transactions.pop();
	}
	
	public int getSize() {
		return transactions.size();
	}
}