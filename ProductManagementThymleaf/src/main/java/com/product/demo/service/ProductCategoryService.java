package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.ProductCategory;


public interface ProductCategoryService {
	List<ProductCategory> findAll();

	public void addCategory(ProductCategory productcategory);

	public ProductCategory findById(Integer categoryid);

	public void deleteCategory(Integer categoryid);

}
