package com.educandoweb.coursebootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.coursebootjpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
