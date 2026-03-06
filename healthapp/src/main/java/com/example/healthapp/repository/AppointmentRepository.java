package com.example.healthapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.healthapp.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long>{
    
}
