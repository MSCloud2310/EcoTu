package com.example.auth_user.controller;

import com.example.auth_user.entity.supplier;
import com.example.auth_user.service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//http://localhost:8081/user
public class supplierController {

    @Autowired
    private com.example.auth_user.service.supplierService supplierService;

    @GetMapping("/suppliers")
    public ResponseEntity<List<supplier>> getAllSuppliers(){
        return new ResponseEntity<>(supplierService.getAllSuppliers(), HttpStatus.OK);
    }

    @GetMapping("/supplier/{id}")
    public  ResponseEntity<supplier> getOneSupplier(@PathVariable Integer id){
        return  new ResponseEntity<>(supplierService.getOneSupplier(id),HttpStatus.OK);
    }

    @PostMapping("/supplier")
    public ResponseEntity<String> newSupplier(@RequestBody supplier newSupplier){
        supplierService.saveSupplier(newSupplier);
        return  new ResponseEntity<>("Se ha agregado con exito",HttpStatus.OK);
    }

    @PutMapping("/supplier")
    public ResponseEntity<String> updateSupplier(@RequestBody supplier updateSupplier){
        supplierService.updateSupplier(updateSupplier);
        return  new ResponseEntity<>("Se ha modificado con exito",HttpStatus.OK);
    }

    @DeleteMapping("/supplier/{id}")
    public ResponseEntity<String> deleteSupplier(@PathVariable Integer id){
        supplierService.deleteSupplier(id);
        return  new ResponseEntity<>("Se ha eliminado con exito",HttpStatus.OK);
    }

}
