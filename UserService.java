package com.appointment.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.appointment.Exception.CustomUserException;
import com.appointment.entity.User;
import com.appointment.model.UserWrapper;
import com.appointment.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	

	public UserWrapper createUser(UserWrapper userWrapper) {
		try {
		userRepository.save(User.builder().setName(userWrapper.getName()).setEmail(userWrapper.getEmail()));
		}
		catch(Exception e) {
			throw new CustomUserException( 500 ,new Timestamp(new Date().getTime()) ,"User not created, error occured",)
		}
	}
	
}
