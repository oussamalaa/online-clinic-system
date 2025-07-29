package com.clinicTech.entity;

import java.time.LocalDate;
import lombok.*;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private HealthCareProfessional professional;
    private LocalDate appointmentTime;
    private AppointmentStatus status;

}
