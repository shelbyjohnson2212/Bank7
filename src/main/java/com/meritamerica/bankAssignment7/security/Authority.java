package com.meritamerica.bankAssignment7.security;

import org.springframework.security.core.GrantedAuthority;

//import com.meritamerica.bankAssignment7.security.GrantedAuthority;

public class Authority implements GrantedAuthority {
	private String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return this.authority;
	}

}
