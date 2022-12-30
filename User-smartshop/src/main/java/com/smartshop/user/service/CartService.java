package com.smartshop.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smartshop.user.entity.Cart;
import com.smartshop.user.entity.Product;
import com.smartshop.user.repository.CartRepository;
import com.smartshop.user.repository.CustomerRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public double calculatePrice (Integer id) {
		double totalPrice = 01;
		List<Cart> items = cartRepo.findCartById(id);
		for(Cart item: items) {
			Product product= restTemplate.getForObject("http://localhost:8001//getproduct/"+item.getpId(),Product.class);
					totalPrice = totalPrice+(item.getpQuantity()*product.getpPrice());
		}
					return totalPrice;
		}
	//
	public List<Cart> getAllItem(int id){
		return cartRepo.findCartById(id);
	}
	//find by cart id
	public Optional<Cart> getbyid(int cartId) {
		return cartRepo.findById(cartId);
	}
	
	public Cart addToCart(Cart cart) {
		return cartRepo.save(cart);
	}
	
//	public double calculatePrice (Integer pId) {
//		double totalPrice = 01;
//		List<Cart> items = cartRepo.findCartById(pId);
//		for(Cart item: items) {
//			Product product= restTemplate.getForObject("http://localhost:8001//getproduct/"+item.getpId(),Product.class);
//					totalPrice = totalPrice+(item.getpQuantity()*product.getpPrice());
//		}
//					return totalPrice;
//		}
//	
//	public List<Cart> getAllItem(int pId){
//		return cartRepo.findCartById(pId);
//	}
//	
//	public Cart addToCart(Cart cart) {
//		return cartRepo.save(cart);
//	}
	}
