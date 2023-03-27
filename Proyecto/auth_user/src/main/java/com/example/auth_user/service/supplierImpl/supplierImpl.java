package com.example.auth_user.service.supplierImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.auth_user.DTO.supplierDTO;
import com.example.auth_user.DTO.supplierLoginDTO;
import com.example.auth_user.entity.supplier;
import com.example.auth_user.entity.supplier;
import com.example.auth_user.repository.supplierRepository;
import com.example.auth_user.response.loginResponse;
import com.example.auth_user.service.ISupplierService;


@Service
public class supplierImpl implements ISupplierService{

	
	@Autowired
	private supplierRepository supplierRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public String addSupplier(supplierDTO supplierDTO) {
		
		supplier supplier = new supplier(
				
				supplierDTO.getId_supplier(),
				supplierDTO.getName(),
				supplierDTO.getUsername(),
				this.passwordEncoder.encode(supplierDTO.getPassword()),
				supplierDTO.getAge(),
				supplierDTO.getProfile_photo(),
				supplierDTO.getPhone_number(),
				supplierDTO.getWeb_page(),
				supplierDTO.getSocial_media(),
				supplierDTO.getDescripction()
				);
		
		supplierRepository.save(supplier);
		return supplier.getName();
	
	}
	

	@Override
	public loginResponse loginSupplier(supplierLoginDTO loginDTO) {
		
		String msg = "";
		supplier supplier1 = supplierRepository.findByUsername(loginDTO.getUsername());
		
		if(supplier1 != null) {
			
			String password = loginDTO.getPassword();
            String encodedPassword = supplier1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			
            if (isPwdRight) {
                Optional<supplier> supplier = supplierRepository.findOneByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
                if (supplier.isPresent()) {
                    return new loginResponse("Login Success", true);
                } else {
                    return new loginResponse("Login Failed", false);
                }
            } else {
 
                return new loginResponse("password Not Match", false);
            }
        }else {
            return new loginResponse("Email not exits", false);
        }
		
		
	}

}
