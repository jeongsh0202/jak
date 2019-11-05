package com.jak.product.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jak.product.core.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	
	
}
