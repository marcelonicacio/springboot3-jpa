package com.marcenica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcenica.course.entities.OrderItem;
import com.marcenica.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
