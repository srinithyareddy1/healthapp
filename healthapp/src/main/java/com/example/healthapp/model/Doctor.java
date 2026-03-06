package com.example.healthapp.model;

import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;

    public Doctor(){
        
    }

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization= specialization; 
    }
    public String getName(){
        return name;
    }

    public String getSpecialization(){
        return specialization;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}