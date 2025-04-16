package com.patientinformation.patientdemographics.repository;

import com.patientinformation.patientdemographics.entity.RelatedPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatedPersonRepository extends JpaRepository<RelatedPerson,Long> {
}
