package com.example.auth_user.controller;

import com.example.auth_user.entity.supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.auth_user.DTO.supplierDTO;
import com.example.auth_user.DTO.supplierLoginDTO;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.service.ISupplierService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
//http://localhost:8081/user
public class supplierController {

    @Autowired
   private ISupplierService isupplierService;


	@PostMapping(path = "/supplier")
	public String saveSupplier(@RequestBody supplierDTO supplierDTO) {
		
		String id = isupplierService.addSupplier(supplierDTO);
		return id;	
	}
	
	
	@PostMapping(path = "/supplier/ecotu")
	public ResponseEntity<?> loginSupplier(@RequestBody supplierLoginDTO loginDTO) {
		
		loginResponse loginResponse = isupplierService.loginSupplier(loginDTO);
		
		return ResponseEntity.ok(loginResponse);
		
	}

	@GetMapping(path = "/supplier")
	public  ResponseEntity<List<supplier>> getAllSuppliers(){
		return new ResponseEntity<>(isupplierService.getAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/supplier/{id}")
	public  ResponseEntity<?> getAllSuppliers(@PathVariable Integer id){
		List<supplier> suppliersAux= isupplierService.getAll();
		for (supplier supplier: suppliersAux){
			if (supplier.getId_supplier()==id){
				return new ResponseEntity<>(isupplierService.getOne(id), HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Error. Id no existe", HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
