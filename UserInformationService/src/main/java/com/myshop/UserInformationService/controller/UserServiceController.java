package com.myshop.UserInformationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.UserInformationService.service.UserService;

import msmodels.users.User;

@RestController
public class UserServiceController {

	@Autowired
	UserService userService;
	
	@GetMapping("/myshop/login/{userName}")
	public ResponseEntity<User> getUserInfo(@PathVariable String userName) {
		return new ResponseEntity<User>(userService.getUser(userName), HttpStatus.OK);
	}
	
	@GetMapping("/myshop/hello")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
}
