package com.smartshop.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smartshop.users.entity.Manager;
import com.smartshop.users.entity.Product;
import com.smartshop.users.repository.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Manager fetchUserByUserNameAndPassword(String managerUserName, String managerPassword) {
		return managRepository.findByManagerUserNameAndManagerPassword(managerUserName, managerPassword);
	}
	
	public Product getProduct(int pId) {
		Product p= 	restTemplate.getForObject("http://localhost:8001//getproduct/"+pId, Product.class);
		return p;
	}
	//add product
	public Product addProduct(Product product) {
		Product padd = restTemplate.postForObject("http://localhost:8001//product", product, Product.class);
		return padd;
	}
	public List<Product> getAllproducts(){
		List p= restTemplate.getForObject("http://localhost:8001//getAllProduct", List.class);
		return p;
	}

	public Product findBypName(String pName) {
		Product p1= restTemplate.getForObject("http://localhost:8001//getByName/"+pName, Product.class);
		// TODO Auto-generated method stub
		return p1;
	}
	
}
