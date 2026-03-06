package com.example.healthapp.service;

import com.example.healthapp.model.Appointment;
import com.example.healthapp.model.Doctor;
import java.util.List;

public interface AppointmentService{
    
    


   
   List<Doctor> getAllDoctors();
   Doctor addDoctor(Doctor doctor);
   Doctor updateDoctor(Long id, Doctor doctor);
   void deleteDoctor(Long id);

   Appointment bookAppointment(Appointment appointment);
   List<Appointment> getAllAppointments();
}
