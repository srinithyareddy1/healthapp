package com.example.healthapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DoctorDTO {
    @NotBlank(message="Doctor name cannot be empty")
    @Size(min=2,max=50)
    
    private String name;
    private String specialization;
    
    public DoctorDTO(){ }


    public DoctorDTO(String name , String specialization){

        this.name=name;
        this.specialization=specialization;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSpecialization(){
        return specialization;

    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    
}
