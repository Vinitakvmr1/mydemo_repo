package com.tcs.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.productservice.entity.Product;
import com.tcs.productservice.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class Productcontroller {

	@Autowired
	ProductService productService;

	@GetMapping("/")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProduct(id);
	}

	@PostMapping("/")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/{id}")
	public void editProduct(@PathVariable int id, @RequestBody Product product) {
		productService.editProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
}