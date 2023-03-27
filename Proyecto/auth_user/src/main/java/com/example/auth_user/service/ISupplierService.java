package com.example.auth_user.service;

import com.example.auth_user.response.loginResponse;
import com.example.auth_user.DTO.supplierDTO;
import com.example.auth_user.DTO.supplierLoginDTO;

public interface ISupplierService {
	
	String addSupplier(supplierDTO suppliertDTO);

	loginResponse loginSupplier(supplierLoginDTO loginDTO);

}
