package com.smartshop.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.users.entity.Manager;
import com.smartshop.users.entity.Product;
import com.smartshop.users.service.ManagerService;



@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerController {
	
	@Autowired
	private ManagerService managService;
	
	//8002:manager/login
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public Manager loginUser(@RequestBody Manager manager) throws Exception {
		String tempUserName = manager.getManagerUserName();
		String tempPassword = manager.getManagerPassword();
		Manager userObj = null;
		if(tempUserName != null && tempPassword!=null) {
			userObj = managService.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials!");
		}else {
			System.out.println("Successfully manager Register");
		}
		return userObj;
	}
	
	@GetMapping("/getproduct/{pId}")
	public Product getProduct(@PathVariable ("pId") int pId) {
		return managService.getProduct(pId);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return managService.addProduct(product);
	}
	
	@GetMapping("/getallProd")
	public List<Product> getAllProduct(){
		return managService.getAllproducts();
	}
	
	@GetMapping("/getByName/{pName}")
	public Product findBypName(@PathVariable("pName") String pName) {
		return managService.findBypName(pName);
	}
}
