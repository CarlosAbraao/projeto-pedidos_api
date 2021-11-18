package com.devcarlosabraao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosabraao.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
