package com.appointment.Exception;

import java.sql.Timestamp;

public class CustomUserException extends Exception {
	String errorCode;
	Timestamp time;
	String message;
	public CustomUserException(String message, String errorCode,
	Timestamp time) {
		this.errorCode =errorCode;
		this.time = time;
		this.message =message;
		
		// TODO Auto-generated constructor stub
	}
	
}
