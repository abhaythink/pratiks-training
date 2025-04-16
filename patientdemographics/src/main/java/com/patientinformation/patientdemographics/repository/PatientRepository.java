package com.patientinformation.patientdemographics.repository;

import com.patientinformation.patientdemographics.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <Patient,Long>  {
}
