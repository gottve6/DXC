package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.Product;
import com.dxc.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/create")
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);

	}

	@PostMapping("/createAll")
	public List<Product> addProducts(List<Product> products) {
		return service.addProducts(products);
	}

	@GetMapping("/readAll")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/read/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return service.getProductById(id);
	}

}
