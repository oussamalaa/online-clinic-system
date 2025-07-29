package com.clinicTech.entity;

import java.time.LocalDate;
import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Patient {
    @Id
    private long id;

    @OneToOne
    @MapsId

    private User user;

    @Column(nullable = false)
    private String FirstName;
    private String LastName;
    private String Gender;
    private LocalDate DateOfBirht;

}
