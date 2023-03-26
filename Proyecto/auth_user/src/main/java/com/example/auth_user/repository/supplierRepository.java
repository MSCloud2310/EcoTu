package com.example.auth_user.repository;

import com.example.auth_user.entity.supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface supplierRepository extends JpaRepository<supplier,Integer> {
}
