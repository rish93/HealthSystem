package com.appointment.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserWrapper {

    private Integer id;
	
	private String name;
	
	private String role;

	private String email;
	
	private String pssword;
	
	private String contact;
	
	private String address;
	
	private Date date_of_birth;
}


