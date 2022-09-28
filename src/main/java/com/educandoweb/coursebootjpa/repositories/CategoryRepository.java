package com.educandoweb.coursebootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.coursebootjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
