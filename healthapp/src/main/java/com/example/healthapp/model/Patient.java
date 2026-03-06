package com.example.healthapp.model;

import jakarta.persistence.*;
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    public Patient(){}

    public Patient(String name, String email, String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }

    
}
