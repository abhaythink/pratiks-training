package com.patientinformation.patientdemographics.controller;


import com.patientinformation.patientdemographics.dto.PatientDto;
import com.patientinformation.patientdemographics.service.FhirService;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<String> createPatient(@RequestBody PatientDto patientDto) {
        System.out.println("Scheduling Job is running at " + System.currentTimeMillis());
        String id = fhirService.sendPatient(patientDto);
        return ResponseEntity.ok("Patient created with ID: " + id);

    }


    @Scheduled(cron = "0 */5 * * * *")
    @PostMapping("/patient/scheduled")
    public ResponseEntity<String> createPatientScheduled () {
        //created demo method which will show the cron job work
        //expected to print th logs but for understanding purpose only
        System.out.println("Job is running at " + System.currentTimeMillis());
        String id = fhirService.sendPatient(new PatientDto());
        return ResponseEntity.ok("Patient created with ID: " + id);

    }

}

