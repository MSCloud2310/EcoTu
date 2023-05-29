package com.example.auth_user.repository;

import com.example.auth_user.entity.client;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface clientRepository extends JpaRepository<client, Integer> {

	client findByUsername(String username);

	Optional<client> findOneByUsernameAndPassword(String username, String encodedPassword);

}
