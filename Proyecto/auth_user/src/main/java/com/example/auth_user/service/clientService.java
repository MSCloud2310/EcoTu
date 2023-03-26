package com.example.auth_user.service;

import com.example.auth_user.entity.client;
import com.example.auth_user.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clientService {

    @Autowired
    private com.example.auth_user.repository.clientRepository clientRepository;

    //Get all clients
    public List<client> getAllClients(){
        return  clientRepository.findAll();
    }

    //Get one client
    public client getOneClient(Integer id){return clientRepository.findById(id).get();
    }

    //Post
    public void saveClient(client newclient){
        clientRepository.save(newclient);
    }

    //Put
    public  void updateClient(client updateClient){
        client client= clientRepository.findById(updateClient.getId_client()).get();

        client.setAge(updateClient.getAge());
        client.setName(updateClient.getName());
        client.setPassword(updateClient.getPassword());
        client.setUsername(updateClient.getUsername());
        client.setProfile_photo(updateClient.getProfile_photo());

        clientRepository.save(client);

    }

    //Delete
    public  void deletClient (Integer id){
        clientRepository.deleteById(id);
    }






}
