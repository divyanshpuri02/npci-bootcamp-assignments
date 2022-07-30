package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.entity.Product;
import com.product.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/productlist")
	public List<Product> findAll(){
		return service.findAll();
	}
	
	@PostMapping("/saveproduct")
	public String saveProduct(@RequestBody Product product) {
	ProductService.saveOrUpdate(product);
	return "Product Details added successfully";
	}
	
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product p) throws Exception {
		ProductService.saveOrUpdate(p);
		return "Category ID : "+ p.getCategoryid() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("product/{id}")
	public String deleteById(@PathVariable int id) {
		ProductService.deleteById(id);
		return "Product ID : " + id +"details  deleted !!!";
	}
	
}
