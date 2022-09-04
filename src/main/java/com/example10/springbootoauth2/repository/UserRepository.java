package com.example10.springbootoauth2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example10.springbootoauth2.entites.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByName(String name);
}
