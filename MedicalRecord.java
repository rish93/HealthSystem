package com.appointment.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class MedicalRecord  implements Serializable {

	
	@Id
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patientId;
	

	@Column(name="doctor_id")
	private Integer doctorId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="appointment_id")
	private Appointment appointmentId;
	
	@Column(name="medical_notes")
	private String medicalNotes;

	@Column(name="timestamp")
	private Timestamp updatedAt;
	
}
