package com.example.demo.service.impl;

import com.example.demo.entity.studentEntity;
import com.example.demo.repository.studentRepo;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    private studentRepo repo;

    @Override
    public List<studentEntity> getAll() {
        return repo.findAll();
    }
}
