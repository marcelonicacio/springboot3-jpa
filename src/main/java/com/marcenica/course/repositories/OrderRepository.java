package com.marcenica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcenica.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
