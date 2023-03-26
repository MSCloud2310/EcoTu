package com.example.shopping_cart.repository;

import com.example.shopping_cart.entity.shoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shoppingRepository  extends JpaRepository<shoppingCart, Integer> {

}
