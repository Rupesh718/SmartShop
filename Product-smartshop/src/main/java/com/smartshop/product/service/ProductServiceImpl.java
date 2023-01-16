 package com.smartshop.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;
import com.smartshop.product.exceptions.ProductNotFoundException;
import com.smartshop.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepo proRepo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return proRepo.save(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return proRepo.saveAll(products);
	}

	@Override
	public List<Product> GetAllProducts() {
		return proRepo.findAll();
	}

//	@Override
//	public Product UpdatePrdoductbyId(int pId) {
//		return proRepo.updateProduct(pId);
//	}

	@Override
	public Product GetProductbyId(int pId) {
		return proRepo.findById(pId).orElseThrow(() -> new ProductNotFoundException("Product Not found!"));
	}

	@Override
	public void DeletProductbyId(int pId) {
		proRepo.deleteById(pId);;
	}

	@Override
	public Product findBypName(String pName) {
		// TODO Auto-generated method stub
		return proRepo.findBypName(pName);
	}

	@Override
	public Product updateProduct(Product product, int pId) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public Optional<Product> getbyName(String pName) {
//		// TODO Auto-generated method stub
//		return proRepo.findByname(pName);
//	}
}
