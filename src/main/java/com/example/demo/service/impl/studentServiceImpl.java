package com.example.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.sterotype.Service.*;
import com.example.demo.entity.studentEntity;

import com.example.demo.respository.*;

@Service
public class StudentServiceImpl implements studentService{

    @Autowired
    studentRepo repo;

    public List<studentEntity>getAll(){
        return repo.findAll();
    }
}