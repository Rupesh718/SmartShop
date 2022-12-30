package com.smartshop.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.user.entity.Cart;
import com.smartshop.user.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	@Autowired
	private CartService cartServ;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addCart")
	public Cart addToCart(@RequestBody Cart cart) {
		return cartServ.addToCart(cart);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/totalprice/{id}")
	public Double getTotalPrice(@PathVariable("id") int id) {
		return cartServ.calculatePrice(id);
	}
	
	@GetMapping("/getCart/{id}")
	public List<Cart> getAllItem(@PathVariable("id") int id){
		return cartServ.getAllItem(id);
	}
	@GetMapping("/getbyCartId/{cartId}")
	public Optional<Cart> getbyid(@PathVariable("cartId")int cartId) {
		return cartServ.getbyid(cartId);
	}

}
