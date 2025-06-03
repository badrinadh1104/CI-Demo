package com.product_service.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.product_service.Model.Product;
import com.product_service.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	private ProductRepository productRepository;


	public ProductService(ProductRepository productRepository) {
		log.warn("created a Product repo");
		this.productRepository = productRepository;
	}

	public String Addproduct(Product product) {
		log.info("in method");
		productRepository.save(product);
		log.info("Product added");
		return "product added";
		
	}
	
	public Optional<Product> getProductById(Long id) {
		log.info("allProduct");
        return productRepository.findById(id);
    }
	
	public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
	

}
