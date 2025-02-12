package com.ecom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.models.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

	public Cart findByProductIdAndUserId(Integer productId, Integer uid);
	
	public Integer countByUserId(Integer userId);
	
	public List<Cart> findByUserId(Integer userId);
}
