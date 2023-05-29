package com.example.auth_user.service;

import com.example.auth_user.DTO.clientDTO;
import com.example.auth_user.DTO.clientLoginDTO;
import com.example.auth_user.entity.client;
import com.example.auth_user.response.loginResponse;

import java.util.List;
import java.util.Optional;

public interface IClientService {
	
	String addClient(clientDTO clientDTO);

	loginResponse loginClient(clientLoginDTO loginDTO);

	List<client> getAll();

	Optional<client> getOne(Integer idClient);

	

}
