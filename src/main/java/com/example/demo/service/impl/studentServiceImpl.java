package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Override
    public List<StudentEntity> getAll() {
        return repo.findAll();
    }
}
