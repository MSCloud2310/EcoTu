package com.example.auth_user.repository;

import com.example.auth_user.entity.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<client,Integer> {
}
