package com.example.interaction.repository;

import com.example.interaction.entity.comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface commentsRepository extends JpaRepository<comment, Integer> {
}
