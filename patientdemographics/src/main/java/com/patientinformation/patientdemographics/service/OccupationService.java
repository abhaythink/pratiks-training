package com.patientinformation.patientdemographics.service;


import com.patientinformation.patientdemographics.dto.OccupationDto;
import com.patientinformation.patientdemographics.entity.Occupation;
import com.patientinformation.patientdemographics.entity.Patient;
import com.patientinformation.patientdemographics.repository.OccupationRepository;
import com.patientinformation.patientdemographics.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OccupationService {

    private final OccupationRepository repository;
    private final PatientRepository patientRepository;

    public OccupationService(OccupationRepository repository, PatientRepository patientRepository) {
        this.repository = repository;
        this.patientRepository = patientRepository;
    }

    public List<Occupation> getAll() {
        return repository.findAll();
    }

    public Optional<Occupation> getById(Long id) {
        return repository.findById(id);
    }

    public Occupation add(OccupationDto occupationDto) {
        Long patientId = occupationDto.getPatientId();
        Optional<Patient> patientOptional = patientRepository.findById(patientId);
        if (patientOptional.isPresent()) {
            Patient patient = patientOptional.get();
            Occupation occupation = new Occupation();
            occupation.setOccupationName(occupationDto.getOccupationName());
            occupation.setIndustry(occupationDto.getIndustry());
            //occupation.setPatient(patient);
            Occupation occupationSaved = repository.save(occupation);
            return occupationSaved;
        }
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
