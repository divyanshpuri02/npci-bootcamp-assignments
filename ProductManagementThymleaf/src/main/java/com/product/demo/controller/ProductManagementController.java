package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.demo.entity.Product;
import com.product.demo.entity.ProductCategory;
import com.product.demo.service.ProductCategoryService;
import com.product.demo.service.ProductService;

@Controller
@RequestMapping("/productmanagement")
public class ProductManagementController {
	@Autowired
	ProductService productservice;
	
	@Autowired
	ProductCategoryService productcategoryservice;
	
	@GetMapping("/products")
	public String displayAllProducts(Model model) {
		
		List<Product> products = productservice.findAll();
		model.addAttribute("PRODUCT", products);
		return "Frontend/products.html";
	}
	
	@GetMapping("/displaynewform")
	public String displayProductForm(Model model) {
		
		model.addAttribute("PRODUCT",new Product());
		return "Frontend/newproduct.html";
			
	}
	@PostMapping("/newproduct")
	public String addProduct(@ModelAttribute Product product) {
	
		productservice.addProduct(product);
		return "redirect:/ProductManagement/products";
		
	}
	
	@GetMapping("/delete")
	public String  deleteProduct(@RequestParam("id") Integer id) {
		
		productservice.deletProduct(id);
		return "redirect:/ProductManagement/products";
		
	}
	
	@GetMapping("/updateproduct")
	public  String updateProduct(@RequestParam("id") Integer id,Model model) {
		
		Product product = productservice.findById(id);
		productservice.addProduct(product);
		model.addAttribute("PRODUCT",product);
		return "Frontend/newproduct.html";
	}
	
	@GetMapping("/bycategory")
	public String productByCategory(@RequestParam("categoryid") Integer categoryid,Model model) {
	
		List<Product> product = productservice.findByCategory(categoryid);
		model.addAttribute("PRODUCT",product);
		return  "Frontend/products.html";
	}
	

	@GetMapping("/byname")
	public String searchByProductname(@RequestParam("name") String name, Model model) {	
		
		List<Product> product = productservice.findByname(name);
		model.addAttribute("PRODUCT",product);
		return  "Frontend/products.html";
	}
	@GetMapping("/category")
	public String displayAllProCategory(Model model) {
		
		List<ProductCategory> productcategory = productcategoryservice.findAll();
		model.addAttribute("CATEGORY",productcategory);
		return "Frontend/productcategory.html";
		
	}
	@GetMapping("/addcategoryform")
	public String categoryForm(Model model) {
		
		model.addAttribute("CATEGORY",new ProductCategory());
		return "AppFrontend/newcategoryform.html";
		
	}
	@PostMapping("/newCategory")
	public String addcategory(@ModelAttribute ProductCategory pc) {
		
		productcategoryservice.addCategory(pc);
		return "redirect:/productmanagement/category";
	}
	@GetMapping("/updatecategoryform")
	public  String updateCategory(@RequestParam("categoryid") Integer categoryid,Model model){
		
		ProductCategory productcategory = productcategoryservice.findById(categoryid);
		productcategoryservice.addCategory(productcategory);
		model.addAttribute("CATEGORY",productcategory);
		return "Frontend/newcategoryform.html";
	}
	@GetMapping("/deletecategory")
	public String  deleteCategory(@RequestParam("categoryid") Integer categoryid) {
		
		productcategoryservice.deleteCategory(categoryid);
		return "redirect:/productmanagement/category";
		
	}
}
