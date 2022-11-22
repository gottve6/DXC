package com.dxc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.entity.Product;
import com.dxc.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired(required=false)
	private ProductRepository repo;

	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	public List<Product> addProducts(List<Product> products) {
		return (List<Product>) repo.saveAll(products);
	}

	public List<Product> getAllProducts() {
		
		List<Product> products = new ArrayList<Product>();
		repo.findAll().forEach(prods->products.add(prods));
		return products;
	}

	public Product getProductById(int id) {
		return repo.findById(id).get();
	}


	
}
