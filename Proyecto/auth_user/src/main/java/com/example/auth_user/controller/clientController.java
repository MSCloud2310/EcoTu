package com.example.auth_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.service.IClientService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class clientController {

	
	@Autowired
	private IClientService iclientService;
	
	
	@PostMapping(path = "/client/save")
	public String saveClient(@RequestBody clientDTO clientDTO) {
		
		String id = iclientService.addClient(clientDTO);
		return id;
		
	}
	
	@PostMapping(path = "/client/login")
	public ResponseEntity<?> loginClient(@RequestBody clientLoginDTO loginDTO) {
		
		loginResponse loginResponse = iclientService.loginClient(loginDTO);
		
		return ResponseEntity.ok(loginResponse);
		
	}
	
	
}
