package com.java.demo.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.sp.entity.Product;
import com.java.demo.sp.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productrepo;
	
	public List<Product> getAllProduct()
	{
		return  (List<Product>) productrepo.findAll() ;
	}
	public Product save(Product prod)
	{
		return productrepo.save(prod);
	}
	public Product getProductById(int prodId)
	{
		return productrepo.findById(prodId).get();
	}
	public Product updateProduct(Product prod)
	{
		return productrepo.save(prod);
		
	}
	public void deleteProduct(int prodId)
	{
		 productrepo.deleteById(prodId);
	}
}
