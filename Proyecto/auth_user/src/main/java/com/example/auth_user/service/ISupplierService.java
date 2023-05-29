package com.example.auth_user.service;

import com.example.auth_user.entity.supplier;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.DTO.supplierDTO;
import com.example.auth_user.DTO.supplierLoginDTO;

import java.util.List;
import java.util.Optional;

public interface ISupplierService {
	
	String addSupplier(supplierDTO suppliertDTO);

	loginResponse loginSupplier(supplierLoginDTO loginDTO);

	List<supplier> getAll();

	Optional<supplier> getOne (Integer id);

}
