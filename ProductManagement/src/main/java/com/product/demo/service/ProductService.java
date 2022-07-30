package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.Product;

public interface ProductService {
	   public List<Product> findAll() ;

		public static void saveOrUpdate(Product pro) {
		}
		public static void deleteById(int id) {

		}
}
