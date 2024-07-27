package com.appointment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appointment.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
  Optional<User> findById(Integer id);
}
