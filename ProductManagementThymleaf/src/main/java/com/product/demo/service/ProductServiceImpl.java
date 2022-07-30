package com.product.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productrepository;
	
	@Override
	public List<Product> findAll() {
		return productrepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productrepository.save(product);
		
	}

	@Override
	public Product findById(Integer id) {
		
		Optional<Product> p = productrepository.findById(id);
		Product product = null;
		
		if(p.isPresent())
			product = p.get();
		return product;
	}

	@Override
	public List<Product> findByname(String name) {
		List<Product> product = null;
		if(name != null && name.trim().length() > 0) {
		product = productrepository.findByname(name);
		}
		else
		{
			product = findAll();
		}
	
		return product;
	}

	@Override
	public void deletProduct(Integer id) {
		productrepository.deleteById(id);
		
	}

	@Override
	public List<Product> findByCategory(Integer categoryid) {
		List<Product> findBycategoryid = productrepository.findBycategoryid(categoryid);
		return findBycategoryid;
	
	}

}
