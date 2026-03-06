package com.example.healthapp.exception;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(String message){
        super(message);
    }
    
}
