package com.example.healthapp.service;

import com.example.healthapp.model.Patient;
import com.example.healthapp.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient registerPatient(Patient patient){
        return patientRepository.save(patient);
    }

    @Override
    public Patient login(String email, String password){

        Patient patient = patientRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        if(!patient.getPassword().equals(password)){
            throw new RuntimeException("Invalid password");
        }

        return patient;
    }
}