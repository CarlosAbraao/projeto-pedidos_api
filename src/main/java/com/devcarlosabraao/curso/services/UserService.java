package com.devcarlosabraao.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.devcarlosabraao.curso.entities.User;
import com.devcarlosabraao.curso.repositories.UserRepository;
import com.devcarlosabraao.curso.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// retornar todos usuarios do banco de dados
	
	public List<User> findAll(){
		return repository.findAll();

}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public User update(Long id, User obj) {
		try {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		
		}catch(RuntimeException e) {
			 e.printStackTrace();
			 throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
		
		
	}
}
