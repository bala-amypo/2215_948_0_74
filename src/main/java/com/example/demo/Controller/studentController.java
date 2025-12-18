package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAllStudent")
    public List<StudentEntity> getAll() {
        return service.getAll();
    }
}
