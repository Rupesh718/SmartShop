package com.smartshop.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;

@Service
public interface ProductService {
	public Product addProduct(Product product);
	public List<Product> saveProducts(List<Product> products);
	public List<Product> GetAllProducts();
	public Product GetProductbyId(int pId);
	public void DeletProductbyId(int pId);
	public Product findBypName(String pName);
	public Product updateProduct(Product product, int pId);

}
