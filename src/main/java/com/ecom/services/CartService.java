package com.ecom.services;

import java.util.List;

import com.ecom.models.Cart;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);
	
	public List<Cart> getCartByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void updateQuantity(String sy, Integer cid);
}
