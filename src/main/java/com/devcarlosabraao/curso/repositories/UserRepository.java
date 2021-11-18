package com.devcarlosabraao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosabraao.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
