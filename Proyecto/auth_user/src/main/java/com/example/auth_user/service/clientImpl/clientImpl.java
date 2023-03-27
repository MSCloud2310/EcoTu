package com.example.auth_user.service.clientImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.entity.client;
import com.example.auth_user.service.IClientService;
import com.example.auth_user.repository.*;
import com.example.auth_user.response.loginResponse;

@Service
public class clientImpl implements IClientService {

	@Autowired
	private clientRepository clientRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public String addClient(clientDTO clientDTO) {
		
		client client = new client(
				
			clientDTO.getId_client(),
			clientDTO.getName(),
			clientDTO.getUsername(),
			this.passwordEncoder.encode(clientDTO.getPassword()),
			clientDTO.getAge(),
			clientDTO.getProfile_photo(),
			clientDTO.getDescripction()
			);
		
		clientRepository.save(client);
		
		return client.getName();
		
	}
		 

		@Override
		public loginResponse loginClient(clientLoginDTO loginDTO) {
			String msg = "";
			client client1 = clientRepository.findByUsername(loginDTO.getUsername());
			
			if(client1 != null) {
				
				String password = loginDTO.getPassword();
	            String encodedPassword = client1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
				
	            if (isPwdRight) {
	                Optional<client> client = clientRepository.findOneByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
	                if (client.isPresent()) {
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
