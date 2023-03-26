package com.example.shopping_cart.controller;

import com.example.shopping_cart.entity.response;
import com.example.shopping_cart.entity.shoppingCart;
import com.example.shopping_cart.service.shopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
//http://localhost:8084/shopping/
public class shopController {

    @Autowired
    private com.example.shopping_cart.service.shopService shopService;






}
