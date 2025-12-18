package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.bans.factory.annotation.*;
import org.springframe.web.bind.annotation.GetMapping;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    @AutoWired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        return service.getAll();
    }
}