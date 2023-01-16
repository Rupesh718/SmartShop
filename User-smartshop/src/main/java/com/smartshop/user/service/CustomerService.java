package com.smartshop.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smartshop.user.entity.Customer;
import com.smartshop.user.entity.Product;
import com.smartshop.user.repository.CustomerRepository;



@Service
public class CustomerService {
	
	@Autowired
	public CustomerRepository custRepo;
	
	@Autowired
	public RestTemplate restTemplate;

	public Customer RegisterNew(Customer customer) {
		return custRepo.save(customer);
	}
	
	public Customer fetchUserByUserNameAndPassword(String userName, String password){
		return custRepo.findByUserNameAndPassword(userName, password);	
}
	public Product getProduct(int pId) {
		//resttemplate code
		Product p= 	restTemplate.getForObject("http://localhost:8001//getproduct/"+pId, Product.class);
		return p;
	}
	
	public List<Product> getAllproducts(){
		List pr= restTemplate.getForObject("http://localhost:8001//getAllProduct", List.class);
		return pr;
	}
	
	public Product findBypName(String pName) {
		Product p1= restTemplate.getForObject("http://localhost:8001//getByName/"+pName, Product.class);
		// TODO Auto-generated method stub
		return p1;
	}
	
	
}
