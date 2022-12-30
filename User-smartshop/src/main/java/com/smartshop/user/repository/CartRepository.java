package com.smartshop.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartshop.user.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	@Query(value="SELECT * FROM cart  WHERE cart_id = :id",nativeQuery = true)
	List<Cart> findCartById(Integer id);
	
	
//List<Cart> findCartById(@Param("pId")Integer pId);
//	@Modifying
//	@Query("update Cart c set c.pQuantity where c.id = :id")
//	void updateQuantity(@Param("pQuantity") Integer pQuantity, @Param("pId") Integer id);
//	
}
