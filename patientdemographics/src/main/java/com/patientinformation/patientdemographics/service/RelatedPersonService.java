package com.patientinformation.patientdemographics.service;


import com.patientinformation.patientdemographics.entity.RelatedPerson;
import com.patientinformation.patientdemographics.repository.RelatedPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelatedPersonService {

    private final RelatedPersonRepository repository;

    public RelatedPersonService(RelatedPersonRepository repository) {
        this.repository = repository;
    }

    public List<RelatedPerson> getAll() {
        return repository.findAll();
    }

    public Optional<RelatedPerson> getById(Long id) {
        return repository.findById(id);
    }

    public RelatedPerson save(RelatedPerson relatedPerson) {
        return repository.save(relatedPerson);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
