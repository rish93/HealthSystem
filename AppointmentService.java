package com.appointment.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.Exception.CustomUserException;
import com.appointment.Exception.CustomeAppointmentException;
import com.appointment.entity.Appointment;
import com.appointment.entity.User;
import com.appointment.model.AppointmentWrapper;
import com.appointment.model.UserWrapper;
import com.appointment.repository.AppointmentRepository;
import com.appointment.repository.UserRepository;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;
	

	public AppointmentWrapper createAppointment(AppointmentWrapper appointmentWrapper) {
		try {
		 Appointment appointment=	appointmentRepository.save(Appointment.builder()
				  .setDate(appointmentWrapper.getDate())
					.setStatus(appointmentWrapper.getStatus()));
		 
		 
		return AppointmentWrapper.builder()
		  .setDate(appointment.getDate())
			.setStatus(appointment.getStatus())
		}
		catch(Exception e) {
			throw new CustomeAppointmentException( 500 ,new Timestamp(new Date().getTime()) ,"Appointment not created, error occured",)
		}
	}
	
	public List<AppointmentWrapper> getAppointment() {
		try {
			return appointmentRepository.findAll();
		}
		catch(Exception e) {
			throw new CustomeAppointmentException( 404 ,new Timestamp(new Date().getTime()) ,"Appointment not created, error occured",)
		}
	}
}
