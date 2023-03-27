package com.example.auth_user.controller;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.DTO.supplierDTO;
import com.example.auth_user.DTO.supplierLoginDTO;
import com.example.auth_user.entity.supplier;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.service.ISupplierService;
import com.example.auth_user.service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
//http://localhost:8081/user
public class supplierController {

    @Autowired
   private ISupplierService isupplierService;


	@PostMapping(path = "/supplier/save")
	public String saveSupplier(@RequestBody supplierDTO supplierDTO) {
		
		String id = isupplierService.addSupplier(supplierDTO);
		return id;	
	}
	
	
	@PostMapping(path = "/supplier/login")
	public ResponseEntity<?> loginSupplier(@RequestBody supplierLoginDTO loginDTO) {
		
		loginResponse loginResponse = isupplierService.loginSupplier(loginDTO);
		
		return ResponseEntity.ok(loginResponse);
		
	}
	
	
	
	
}
