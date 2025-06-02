package com.product_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.product_service.Model.Product;
import com.product_service.repository.ProductRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
	

}
