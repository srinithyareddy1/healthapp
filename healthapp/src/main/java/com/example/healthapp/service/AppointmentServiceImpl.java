package com.example.healthapp.service;

import com.example.healthapp.model.Appointment;
import com.example.healthapp.model.Doctor;
import com.example.healthapp.repository.AppointmentRepository;
import com.example.healthapp.repository.DoctorRepository;
import com.example.healthapp.exception.DoctorNotFoundException;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(DoctorRepository doctorRepository, AppointmentRepository appointmentRepository) {
        this.doctorRepository = doctorRepository;// depepndency injection
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();// db call
    }

    @Override
    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
public Doctor updateDoctor(Long id, Doctor doctor) {

    Doctor existingDoctor = doctorRepository.findById(id)
            .orElseThrow(() -> new DoctorNotFoundException("Doctor not found with id: " + id));

    existingDoctor.setName(doctor.getName());
    existingDoctor.setSpecialization(doctor.getSpecialization());

    return doctorRepository.save(existingDoctor);
}
    @Override
    public void deleteDoctor(Long id) {

        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new DoctorNotFoundException("Doctor not found with id: " + id));

        doctorRepository.delete(doctor);
    }
    @Override
    public List<Appointment>getAllAppointments(){
        return appointmentRepository.findAll();
    }
}