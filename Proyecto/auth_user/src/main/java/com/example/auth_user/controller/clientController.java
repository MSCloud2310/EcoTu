package com.example.auth_user.controller;

import com.example.auth_user.entity.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
//http://localhost:8081/user
public class clientController {
    @Autowired
    private com.example.auth_user.service.clientService clientService;

    @GetMapping("/clients")
    public List<client> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<client> getOneClient(@PathVariable Integer id){
        client clientFound=clientService.getOneClient(id);
        if(clientFound==null){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }else{
            return  new ResponseEntity<>(clientFound,HttpStatus.OK);
        }
    }
    @PostMapping("/client")
    public ResponseEntity<String> newClient(@RequestBody client newClient){
        clientService.saveClient(newClient);
        return new ResponseEntity<>("Se ha agregado con exito",HttpStatus.OK);
    }

    @PutMapping("/client")
    public  ResponseEntity<String> updateClient (@RequestBody client updateClient){
        clientService.updateClient(updateClient);
        return new ResponseEntity<>("Se ha modificado con exito",HttpStatus.OK);
    }

    @DeleteMapping("/client/{id}")
    public  ResponseEntity<String> deleteClient(@PathVariable Integer id){
        clientService.deletClient(id);
        return new ResponseEntity<>("Se ha eliminado con exito",HttpStatus.OK);
    }
}
