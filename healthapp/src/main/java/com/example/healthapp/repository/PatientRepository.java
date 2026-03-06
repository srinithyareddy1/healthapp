package com.example.healthapp.repository;

import com.example.healthapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByEmail(String email);

    Optional<Patient> findByEmailAndPassword(String email, String password);

}