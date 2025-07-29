package com.clinicTech.entity;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class HealthCareProfessional {
    @Id
    private long id;

    @OneToOne
    @MapsId
    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String licenseNumber;

    private String bio;

}
