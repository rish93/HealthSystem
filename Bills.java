package com.appointment.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name="bills")
@Entity
public class Bills  implements Serializable {

	
	@Id
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patientId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="appointment_id")
	private Appointment appointmentId;
	
	@Column(name="amount_due")
	private Integer amountDue;

	@Column(name="billing_status")
	private String billingStatus;
	

	@Column(name="timestamp")
	private Timestamp generatedAt;
	
}

