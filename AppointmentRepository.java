package com.appointment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appointment.entity.Appointment;
import com.appointment.entity.User;
@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
  Optional<Appointment> findById(Integer id);
}
