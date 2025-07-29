package com.clinicTech.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // PATIENT or PROFESSIONAL

    private boolean enabled = true;
}
