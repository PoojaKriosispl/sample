package com.java.demo.sp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.sp.entity.Product;
import com.java.demo.sp.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	@GetMapping("/")
	public String welcome(){
		return "Welcome to the REST Application";
	}

	@GetMapping("/products")
	public List<Product> getAll()
	{
		return productservice.getAllProduct();
	}
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int prodId)
	{
		return productservice.getProductById(prodId);

	}
	@PostMapping("/products")
	public Product saveOrupdate(@RequestBody Product prod)
	{
		return productservice.updateProduct(prod);

	}
	@DeleteMapping("/products/id")
	public void delete(@PathVariable("id") int prodId)
	{
		productservice.deleteProduct(prodId);
	}

}
