package com.appointment.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="appointment")
@Builder
@Data
public class Appointment  implements Serializable {
	
	@Id
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patientId;
	
	
	@Column(name="doctor_id")
	private Integer doctorId;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Column(name="status")
	private String status;

	
}
