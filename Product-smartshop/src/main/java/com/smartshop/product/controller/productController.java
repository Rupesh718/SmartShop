package com.smartshop.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.product.entity.Product;
import com.smartshop.product.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productController {
	
	@Autowired
	public ProductService proser;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return proser.addProduct(product);
	}
	
//	@PostMapping("/updateProduct")
//	public Product UpdatePrdoductbyId(int pId) {
//		// TODO Auto-generated method stub
//		return proser.UpdatePrdoductbyId(pId);
//	}
	@PostMapping("/products")
	public List<Product> saveProducts(List<Product> products){
		return proser.saveProducts(products);
	}

	@GetMapping("/getAllProduct")
	public List<Product> GetAllProducts(){
		return proser.GetAllProducts();
	}

	@GetMapping("/getproduct/{pId}")
	public Optional<Product> GetProductbyid(@PathVariable("pId") int pId) {
		return proser.GetProductbyId(pId);
	}
	  
	@DeleteMapping("/deletProduct/{pId}")
	public void DeletProductbyName(@PathVariable("pId") int pId) {
		 proser.DeletProductbyId(pId);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getByName/{pName}")
	public Product findBypName(@PathVariable("pName") String pName) {
		return proser.findBypName(pName);
	}

}
