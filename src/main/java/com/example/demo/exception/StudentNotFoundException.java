package com.example.demo.exception;

public class StudentNotFoundException extends RuntimeException{
  StudentNotFoundException(String message){
    super(message);
  }
}