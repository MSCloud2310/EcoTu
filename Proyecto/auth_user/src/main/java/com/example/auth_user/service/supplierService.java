package com.example.auth_user.service;

import com.example.auth_user.entity.supplier;
import com.example.auth_user.repository.supplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class supplierService {

    @Autowired
    private com.example.auth_user.repository.supplierRepository supplierRepository;


    //Get all suppliers
    public List<supplier> getAllSuppliers(){
        return  supplierRepository.findAll();
    }

    //Get one
    public  supplier getOneSupplier(Integer id){return  supplierRepository.findById(id).get();}

    //Save
    public  void saveSupplier(supplier newSupplier){supplierRepository.save(newSupplier);}

    //Update
    public  void updateSupplier(supplier updateSupplier){
        supplier supplier=supplierRepository.findById(updateSupplier.getId_supplier()).get();
        supplier.setAge(updateSupplier.getAge());
        supplier.setName(updateSupplier.getName());
        supplier.setPassword(updateSupplier.getPassword());
        supplier.setPhone_number(updateSupplier.getPhone_number());
        supplier.setProfile_photo(updateSupplier.getProfile_photo());
        supplier.setUsername(updateSupplier.getUsername());
        supplier.setSocial_media(updateSupplier.getSocial_media());
        supplier.setWeb_page(updateSupplier.getWeb_page());
        supplierRepository.save(supplier);
    }

    //Delete
    public void deleteSupplier(Integer id){
        supplierRepository.deleteById(id);
    }



}
