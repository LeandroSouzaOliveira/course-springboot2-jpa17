package com.educandoweb.coursebootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.coursebootjpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
