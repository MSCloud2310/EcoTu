package com.example.auth_user.service;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.response.loginResponse;

public interface IClientService {
	
	String addClient(clientDTO clientDTO);

	loginResponse loginClient(clientLoginDTO loginDTO);

	

}
