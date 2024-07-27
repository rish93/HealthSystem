package com.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.appointment.model.AppointmentWrapper;
import com.appointment.model.UserWrapper;
import com.appointment.service.AppointmentService;
import com.appointment.service.UserService;

@Controller("/appointment/")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public ResponseEntity<UserWrapper> createAppointment( AppointmentWrapper appointment) {
		
//		userservice.
		return new ResponseEntity<UserWrapper>(appointmentService.createAppointment(appointment),HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ResponseEntity<List<UserWrapper>> getAppointment() {
		
//		userservice.
		return new ResponseEntity<List<UserWrapper>>(appointmentService.getAllAppointment(),HttpStatus.OK);

	}

}
