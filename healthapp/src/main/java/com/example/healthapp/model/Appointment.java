package com.example.healthapp.model;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientName;

    private String appointmentDate;

    @ManyToOne
    private Doctor doctor;

    public Appointment(){}

    public Appointment(String patientName, String appointmentDate, Doctor doctor){
        this.patientName = patientName;
        this.appointmentDate= appointmentDate;
        this.doctor=doctor;
    }
    public Long getId(){
        return id;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getAppointmentdate(){
        return appointmentDate;
    }
    public Doctor geDoctor(){
        return doctor;
    }

    public void setPatientName(String patientName){
        this.patientName=patientName;
    }

    public void setAppointmentDate(String appointmentDate){
        this.appointmentDate=appointmentDate;
    }
     
    public void setDoctor(Doctor doctor){
        this.doctor=doctor;
    }




    }
    

