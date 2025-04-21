package com.patientinformation.patientdemographics.controller;


import com.patientinformation.patientdemographics.service.FhirService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/fhir")

public class FhirController {
    private final FhirService fhirService;

    public FhirController(FhirService fhirService) {
        this.fhirService = fhirService;

    }

    @PostMapping("/patient")
    public ResponseEntity<String> createPatient() {
        String id = fhirService.sendPatient();
        return ResponseEntity.ok("Patient created with ID: " + id);

    }

}

