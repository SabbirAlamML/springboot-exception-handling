package com.example.actuator.sample.dao;

import com.example.actuator.sample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
