package com.example.demo.repository;

import com.example.demo.entity.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<StudentEntity, Long> {
}
