package com.example.healthapp.controller;

import com.example.healthapp.model.Patient;
import com.example.healthapp.service.PatientService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patients")
@CrossOrigin(origins="http://localhost:3000")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService=patientService;
    }

    @PostMapping("/register")
    public Patient register(@RequestBody Patient patient){
        return patientService.registerPatient(patient);
    }
    @PostMapping("/login")
    public Patient login(@RequestParam String email,
                         @RequestParam String password
    ){
        return patientService.login(email, password);
    }

    
    
}
