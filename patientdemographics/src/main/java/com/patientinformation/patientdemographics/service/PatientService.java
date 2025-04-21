package com.patientinformation.patientdemographics.service;


import com.patientinformation.patientdemographics.dto.OccupationDto;
import com.patientinformation.patientdemographics.dto.PatientDto;
import com.patientinformation.patientdemographics.dto.RelatedPersonDto;
import com.patientinformation.patientdemographics.entity.Occupation;
import com.patientinformation.patientdemographics.entity.Patient;
import com.patientinformation.patientdemographics.entity.RelatedPerson;
import com.patientinformation.patientdemographics.repository.PatientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> findAll() {
        return repository.findAll();
    }

    public Patient findById(Long id) {
        Optional<Patient> patientOptional = repository.findById(id);
        if (patientOptional.isPresent()) {
            return patientOptional.get();
        }
        return null;
    }

    public Patient add(PatientDto patientDto) {
        Patient patient = patientDto.toPatient();

        RelatedPersonDto relatedPersonDto = patientDto.getRelatedPerson();
        RelatedPerson relatedPerson = new RelatedPerson();
        BeanUtils.copyProperties(relatedPersonDto, relatedPerson );

        OccupationDto occupationDto =patientDto.getOccupation();
        Occupation occupation = new Occupation();
        BeanUtils.copyProperties(occupationDto,occupation);

        patient.setOccupation(occupation);
        occupation.setPatient(patient);


        patient.setRelatedPerson(relatedPerson);
        relatedPerson.setPatient(patient);



        return repository.save(patient);
    }

    public Patient update(Long patientId, PatientDto patientDto) {
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}

