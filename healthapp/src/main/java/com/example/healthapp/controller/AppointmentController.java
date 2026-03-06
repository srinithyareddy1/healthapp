package com.example.healthapp.controller;

import com.example.healthapp.dto.DoctorDTO;
import com.example.healthapp.model.Appointment;
import com.example.healthapp.model.Doctor;
import com.example.healthapp.service.AppointmentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
 
import java.util.List;

import javax.print.Doc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/appointments")
@CrossOrigin(origins="http://localhost:3000")
public class AppointmentController {
    private final AppointmentService appointmentService;
    
    public AppointmentController(AppointmentService appointmentService){
        this.appointmentService=appointmentService;
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return appointmentService.getAllDoctors();
    }
    
    @PostMapping("/addDoctor")
    public Doctor addDoctor(@Valid @RequestBody DoctorDTO doctorDTO){

        Doctor doctor=new Doctor();
        doctor.setName(doctorDTO.getName());
        doctor.setSpecialization(doctorDTO.getSpecialization());

        return appointmentService.addDoctor(doctor);
    }
    @PostMapping("/book")
    public Appointment bookAppointment(@RequestBody Appointment appointment){
        return appointmentService.bookAppointment(appointment);
    }
    @PutMapping("/doctor/{id}")
    public Doctor updateDoctor(@PathVariable Long id,
        @RequestBody Doctor doctor
    ){
        return appointmentService.updateDoctor(id, doctor);
    }

    @DeleteMapping("/doctor/{id}")
    public String deleteDoctor(@PathVariable Long id){
        appointmentService.deleteDoctor(id);

        return "Doctor deleted successfully";
    }
    @GetMapping("/all")
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    
}
