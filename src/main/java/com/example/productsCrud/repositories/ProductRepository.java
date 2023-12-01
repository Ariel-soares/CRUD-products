package com.example.productsCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsCrud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
