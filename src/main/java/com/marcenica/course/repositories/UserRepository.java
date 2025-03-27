package com.marcenica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcenica.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
