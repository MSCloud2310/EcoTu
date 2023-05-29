package com.example.auth_user.controller;

import com.example.auth_user.entity.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.service.IClientService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class clientController {

	
	@Autowired
	private IClientService iclientService;
	
	
	@PostMapping(path = "/client")
	public String saveClient(@RequestBody clientDTO clientDTO) {
		
		String id = iclientService.addClient(clientDTO);
		return id;
		
	}
	
	@PostMapping(path = "/client/ecotu")
	public ResponseEntity<?> loginClient(@RequestBody clientLoginDTO loginDTO) {
		
		loginResponse loginResponse = iclientService.loginClient(loginDTO);
		
		return ResponseEntity.ok(loginResponse);
		
	}

	@GetMapping(path = "/client")
	public ResponseEntity<List<client>> getAllClients(){
		return new ResponseEntity<>(iclientService.getAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/client/{id}")
	public ResponseEntity<?> getOneClients(@PathVariable Integer id){
		List<client> auxClient=iclientService.getAll();
		for (client cliente:auxClient ){
			if (cliente.getId_client()==id){
				return new ResponseEntity<>(iclientService.getOne(id), HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Error. Id no existe", HttpStatus.BAD_REQUEST);

	}





	
	
}
