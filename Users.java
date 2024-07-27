package com.appointment.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="users")
@Builder
@Data
public class Users  implements Serializable {

	
	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="role")
	private String role;

	@Column(name="email")
	private String email;
	
	@Column(name="pssword")
	private String pssword;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="address")
	private String address;
	
	@Column(name="dob")
	private Date date_of_birth;
	
}
