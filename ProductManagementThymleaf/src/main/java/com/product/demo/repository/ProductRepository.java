package com.product.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
     List<Product> findBycategoryid(Integer categoryid);
     List<Product> findByname(String name);
}
