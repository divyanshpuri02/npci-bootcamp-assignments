package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.Product;


public interface ProductService {
	List<Product> findAll();

	public void addProduct(Product product);

	public Product findById(Integer id);

	public List<Product> findByname(String name);
	
	public void deletProduct(Integer id);

	public List<Product> findByCategory(Integer categoryid);

	

}
