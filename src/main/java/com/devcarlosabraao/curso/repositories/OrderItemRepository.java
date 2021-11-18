package com.devcarlosabraao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosabraao.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
