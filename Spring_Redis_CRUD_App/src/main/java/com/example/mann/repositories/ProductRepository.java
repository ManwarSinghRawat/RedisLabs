package com.example.mann.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.mann.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
