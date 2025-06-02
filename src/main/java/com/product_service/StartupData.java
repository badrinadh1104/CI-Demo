package com.product_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.product_service.Model.Product;
import com.product_service.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@Component
public class StartupData {

	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void SaveProducts() {
		 List<Product> products = List.of(
		            new Product(null, "iPhone 12", "Apple iPhone 12 with 128GB Storage", 799.99, 50, "Electronics"),
		            new Product(null, "Samsung Galaxy S21", "Samsung Galaxy S21 with 128GB Storage", 699.99, 40, "Electronics"),
		            new Product(null, "MacBook Air", "Apple MacBook Air with M1 Chip", 999.99, 30, "Computers"),
		            new Product(null, "Sony Headphones", "Sony WH-1000XM4 Wireless", 349.99, 100, "Accessories"),
		            new Product(null, "Dell XPS 13", "Dell XPS 13 with Intel i7", 1199.99, 20, "Computers"),
		            new Product(null, "Nike Air Max", "Nike Running Shoes", 129.99, 75, "Clothing"),
		            new Product(null, "Samsung 55 Inch TV", "Samsung 4K UHD TV", 599.99, 25, "Electronics"),
		            new Product(null, "Apple Watch Series 7", "GPS Apple Watch", 399.99, 60, "Accessories"),
		            new Product(null, "Fitbit Charge 5", "Health and Fitness Tracker", 149.99, 80, "Accessories"),
		            new Product(null, "Lenovo ThinkPad", "ThinkPad with Intel i5", 849.99, 15, "Computers")
		        );

		// Output product list
		for (Product product : products) {
			System.out.println(product.toString());
			productRepository.save(product);
		}
	}

}
