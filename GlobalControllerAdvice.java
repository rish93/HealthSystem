package com.appointment.Exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class GlobalControllerAdvice {

	@ExceptionHandler(CustomUserException.class)
	public ResponseEntity<String> reponseMyException(Exception e) {
	return ResponseEntity.status(HttpStatusCode.valueOf(401)).body(e.getMessage());
	}
}