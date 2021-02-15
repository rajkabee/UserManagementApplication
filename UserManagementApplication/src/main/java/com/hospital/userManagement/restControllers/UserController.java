package com.hospital.userManagement.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.userManagement.entities.Address;
import com.hospital.userManagement.entities.User;
import com.hospital.userManagement.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
@RequestMapping(value="/registerNewUser", method=RequestMethod.POST)
public String registerNewUser(@RequestBody User user/* , @RequestBody Address address */) {
	//user.setAddress(address);
	userService.addNewUser(user);
	return "Registration successful";
}

}
