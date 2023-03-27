package com.diomedazo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diomedazo.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer>{
}
