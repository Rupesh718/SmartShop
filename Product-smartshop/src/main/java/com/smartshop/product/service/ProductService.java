package com.smartshop.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;

@Service
public interface ProductService {
	public Product addProduct(Product product);
//	public Product UpdatePrdoductbyId(int pId);
	public List<Product> saveProducts(List<Product> products);
//		return repository.saveAll(product);
	public List<Product> GetAllProducts();
//	return repository.findAll();	
	public Optional<Product> GetProductbyId(int pId);
	public void DeletProductbyId(int pId);
	public Product findBypName(String pName);
	
	public Product updateProduct(Product product, int pId);

}
