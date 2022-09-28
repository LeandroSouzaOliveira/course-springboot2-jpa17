package com.educandoweb.coursebootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursebootjpa.entities.Person;

public interface UserRepository extends JpaRepository<Person, Long>{
	
}
