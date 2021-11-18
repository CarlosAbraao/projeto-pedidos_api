package com.devcarlosabraao.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devcarlosabraao.curso.entities.Product;
import com.devcarlosabraao.curso.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	// retornar todos usuarios do banco de dados
	
	public List<Product> findAll(){
		return repository.findAll();

}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
}
