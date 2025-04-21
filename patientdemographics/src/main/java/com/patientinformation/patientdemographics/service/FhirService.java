package com.patientinformation.patientdemographics.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Service;

@Service
public class FhirService {
    private final IGenericClient client;
    public FhirService() {
        FhirContext ctx = FhirContext.forR4(); // Choose R4, DSTU3, or STU3 based on your server
        this.client = ctx.newRestfulGenericClient("http://localhost:8080/fhir"); // URL to your local FHIR server

    }


    public String sendPatient() {
        Patient patient = new Patient(); //patient for fhir
        patient.addName().setFamily("Virat").addGiven("Kohli");
        patient.setGender(Enumerations.AdministrativeGender.MALE);
        MethodOutcome outcome = client
                .create()
                .resource(patient)
                .execute();
        return outcome.getId().getIdPart(); // Return ID of created patient

    }
}
