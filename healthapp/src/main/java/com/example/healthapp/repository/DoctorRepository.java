package com.example.healthapp.repository;

import com.example.healthapp.model.Doctor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    
}
