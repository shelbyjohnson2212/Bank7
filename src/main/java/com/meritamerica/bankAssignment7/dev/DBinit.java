package com.meritamerica.bankAssignment7.dev;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.meritamerica.bankAssignment7.repositories.MyUserRepo;
import com.meritamerica.bankAssignment7.security.Users;

@Service
public class DBinit implements CommandLineRunner {
	@Autowired
	MyUserRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Users shelby = new Users("shelby", "123", "USER_PRIVILEGE");
		Users robert = new Users("robert", "123", "USER_PRIVILEGE");
		Users admin = new Users("admin", "123", "ADMIN_PRIVILEGE");		
		List<Users> users = Arrays.asList(robert, admin, shelby);
		this.userRepo.saveAll(users);
	}
}
