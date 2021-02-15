package com.hospital.userManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.userManagement.entities.User;
import com.hospital.userManagement.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public void addNewUser(User user) {
		userRepo.save(user);
	}

}
