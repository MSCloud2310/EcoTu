package com.example.interaction.repository;

import com.example.interaction.entity.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface questionRepository extends JpaRepository<question, Integer> {
}
