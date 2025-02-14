package com.appointment.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.appointment.model.UserWrapper;
import com.appointment.service.UserService;

@Controller("/api/")
public class UsermanagmentController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<UserWrapper> createUser( UserWrapper user) {
		
//		userservice.
		return new ResponseEntity<UserWrapper>(userservice.createUser(user),HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<UserWrapper> loginUser( UserWrapper user) {
		
//		userservice.
		return new ResponseEntity<UserWrapper>(userservice.createUser(user),HttpStatus.CREATED);

	}

}
