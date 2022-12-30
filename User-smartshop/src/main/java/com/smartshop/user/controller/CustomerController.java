package com.smartshop.user.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.user.entity.Customer;
import com.smartshop.user.service.CustomerService;

import jakarta.validation.Valid;

import com.smartshop.user.entity.Product;


@RestController
@RequestMapping("/Customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	public CustomerService custServ;
//	8003/customer/addCustomer
	@PostMapping("/addCustomer")
	@CrossOrigin(origins = "http://localhost:4200")
	public Customer RegisterNew(@Valid @RequestBody Customer customer) {
		return custServ.RegisterNew(customer);
	}
	//(http://localhost:8003/Customer/login)
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public Customer loginUser(@Valid @RequestBody Customer customer) throws Exception {
		String tempUserName = customer.getUserName();
		String tempPassword = customer.getPassword();
		Customer userObj = null;
		if(tempUserName != null && tempPassword!=null) {
			userObj = custServ.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials!");
		}else {
			System.out.println("SucessFully");
		}
		return userObj;
	}
	//getting product by name
	@GetMapping("/getproduct/{pId}")
	public Product getProduct(@PathVariable ("pId") int pId) {
		return custServ.getProduct(pId);
	}
	//Customer/getallProd
	@GetMapping("/getallProd")
	public List<Product> getAllProduct(){
		return custServ.getAllproducts();
	}
	
	@GetMapping("/getByName/{pName}")
	public Product findBypName(@PathVariable("pName") String pName) {
		return custServ.findBypName(pName);
	}
}
