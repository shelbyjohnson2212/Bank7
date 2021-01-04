package com.meritamerica.bankAssignment7.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AccountHolderAlreadyExist extends RuntimeException {
	public AccountHolderAlreadyExist(String msg) {
		super(msg);
	}
}