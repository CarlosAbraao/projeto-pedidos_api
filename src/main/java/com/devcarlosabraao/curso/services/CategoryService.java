package com.devcarlosabraao.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devcarlosabraao.curso.entities.Category;
import com.devcarlosabraao.curso.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	// retornar todos usuarios do banco de dados
	
	public List<Category> findAll(){
		return repository.findAll();

}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
}
