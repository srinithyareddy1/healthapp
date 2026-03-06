package com.example.healthapp.service;

import com.example.healthapp.model.Patient;

public interface PatientService {

    Patient registerPatient(Patient patient);


    Patient login(String email, String password);
}
