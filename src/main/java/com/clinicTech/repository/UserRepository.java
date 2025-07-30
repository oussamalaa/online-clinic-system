package com.clinicTech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicTech.entity.User;

public interface UserRepository extends JpaRepository<User, Long> { // JpaRepository a Spring Boot interface that
                                                                    // automatically gives you access to: findAll() ,
                                                                    // save() , delete() ..
    Optional<User> findByemail(String email); // == SELECT * FROM users WHERE email = ?

    boolean existsByEmail(String email);

}
