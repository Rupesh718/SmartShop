package com.smartshop.product.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProductNotFoundException extends RuntimeException {

	private static final int serialVersionUID = 1;
	
	public ProductNotFoundException(String message) {
		super(message);
	}
}
