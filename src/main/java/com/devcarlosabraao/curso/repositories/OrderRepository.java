package com.devcarlosabraao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosabraao.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
