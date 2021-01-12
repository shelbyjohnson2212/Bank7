package com.meritamerica.bankAssignment7.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.meritamerica.bankAssignment7.repositories.MyUserRepo;

@Service
public class MyUserDetail implements UserDetailsService{
	@Autowired
	MyUserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users aUser = userRepo.findByUserName(username);
        MyUserDetail userDetail = new MyUserDetail();
        userDetail.loadUserByUsername(aUser.getUsername());
        System.out.println("loadUserByUsername in detail service " + aUser.getUsername() + " password " + aUser.getPassword());
        return userDetail;
	}	
}