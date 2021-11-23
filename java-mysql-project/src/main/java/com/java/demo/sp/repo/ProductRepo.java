package com.java.demo.sp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.sp.entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {

}
