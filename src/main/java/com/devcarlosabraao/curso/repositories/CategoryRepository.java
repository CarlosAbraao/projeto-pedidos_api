package com.devcarlosabraao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosabraao.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
