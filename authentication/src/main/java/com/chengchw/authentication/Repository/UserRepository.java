package com.chengchw.authentication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.authentication.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByEmail(String email);
	
	User findUserById(Long id);
	
	boolean existsByEmail(String email);
}
