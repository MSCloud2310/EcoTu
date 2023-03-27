package com.example.auth_user.repository;

import com.example.auth_user.entity.client;
import com.example.auth_user.entity.supplier;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface supplierRepository extends JpaRepository<supplier, Integer> {

	supplier findByUsername(String username);

	Optional<supplier> findOneByUsernameAndPassword(String username, String encodedPassword);
}
