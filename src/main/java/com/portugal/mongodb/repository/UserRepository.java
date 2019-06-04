package com.portugal.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.portugal.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
