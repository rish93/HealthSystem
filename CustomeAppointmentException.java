package com.appointment.Exception;

import java.sql.Timestamp;

public class CustomeAppointmentException {
	String errorCode;
	Timestamp time;
	String message;
	public CustomeAppointmentException(String message, String errorCode,
	Timestamp time) {
		this.errorCode =errorCode;
		this.time = time;
		this.message =message;
		
		// TODO Auto-generated constructor stub
	}
	
}
