package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepository;

public class ProductServiceimpl implements ProductService {

	@Autowired
	ProductRepository repository;
	@Override
	public List<Product> findAll() {
		
		return repository.findall();
	}
	
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	public void saveOrUpdate(Product product) {
	repository.saveOrUpdate(product);
	}
    
	public void deleteById(int id) {
	repository.deleteById(id);
	}

}
