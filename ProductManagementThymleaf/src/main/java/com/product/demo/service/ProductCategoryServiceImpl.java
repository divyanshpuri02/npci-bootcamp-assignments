package com.product.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.product.demo.entity.ProductCategory;
import com.product.demo.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
 
	ProductCategoryRepository productcategoryrepository;
	@Override
	public List<ProductCategory> findAll() {
		return productcategoryrepository.findAll();
	}

	@Override
	public void addCategory(ProductCategory productcategory) {
		productcategoryrepository.save(productcategory);
		
	}

	@Override
	public ProductCategory findById(Integer categoryid) {
		Optional<ProductCategory> pc = productcategoryrepository.findById(categoryid);
		ProductCategory productcategory = null;
		if(pc.isPresent())
			productcategory = pc.get();
		return productcategory;
	}

	@Override
	public void deleteCategory(Integer categoryid) {
		productcategoryrepository.deleteById(categoryid);
		
	}

}
