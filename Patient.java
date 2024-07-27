package com.appointment.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient  implements Serializable {
	
	@Id
	private Integer id;

	@Column(name="user_id")
	private User user_id;
	
	@Column(name="mdical_history")
	private String mdicalHistory;
	
	
}
