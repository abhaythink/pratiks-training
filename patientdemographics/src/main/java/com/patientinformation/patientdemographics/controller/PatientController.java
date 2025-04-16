package com.patientinformation.patientdemographics.controller;

import com.patientinformation.patientdemographics.dto.PatientDto;
import com.patientinformation.patientdemographics.entity.Patient;
import com.patientinformation.patientdemographics.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Patient> create(@RequestBody PatientDto patientDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(patientDto));
    }

    @GetMapping("/all")
    public List<Patient> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Patient> update(@PathVariable Long id, @RequestBody PatientDto patientDto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, patientDto));
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id) {
//        if (service.findById(id).isPresent()) {
//            service.delete(id);
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }


}

