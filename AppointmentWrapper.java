package com.appointment.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AppointmentWrapper {

    private Integer patientId;
    private Integer doctorId;
	
	private Date apppointmentDate;
	private String status;
}


