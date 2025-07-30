package com.clinicTech.repository;

import com.clinicTech.entity.HealthCareProfessional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareProfessionalRepository extends JpaRepository<HealthCareProfessional, Long> {
}
