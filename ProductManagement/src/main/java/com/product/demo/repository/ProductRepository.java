package com.product.demo.repository;

import java.util.List;

import com.product.demo.entity.Product;

public interface ProductRepository {

	public List<Product> findall();
	public Product findById(Integer id);
	public void saveOrUpdate(Product product);
	public void deleteById(int empId);
	
}
