package com.patientinformation.patientdemographics.repository;

import com.patientinformation.patientdemographics.entity.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupationRepository extends JpaRepository<Occupation,Long> {
}
