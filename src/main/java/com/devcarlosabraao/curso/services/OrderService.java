package com.devcarlosabraao.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devcarlosabraao.curso.entities.Order;
import com.devcarlosabraao.curso.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	// retornar todos usuarios do banco de dados
	
	public List<Order> findAll(){
		return repository.findAll();

}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
}
