package com.product.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
