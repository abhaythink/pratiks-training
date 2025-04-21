package com.patientinformation.patientdemographics.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import com.patientinformation.patientdemographics.dto.PatientDto;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FhirService {
    private final IGenericClient client;
    public FhirService() {
        FhirContext ctx = FhirContext.forR4();
        this.client = ctx.newRestfulGenericClient("http://localhost:8080/fhir"); // Url for local FHIR server

    }


    public String sendPatient(PatientDto patientDto) {
        Patient patient = new Patient(); //patient for fhir
        patient.addName().setFamily(patientDto.getFirstName()).addGiven(patientDto.getMiddleName()).addGiven(patientDto.getLastName());
        patient.setBirthDate(patientDto.getDateOfBirth());
        patient.setGender(Enumerations.AdministrativeGender.fromCode(patientDto.getSex()));
        /*List<Address> address = new ArrayList<>();
        address.add(patientDto.getCurrentAddress());
        address.add(patientDto.getPreviousAddress());
        patient.setAddress(address);*/
        MethodOutcome outcome = client
                .create()
                .resource(patient)
                .execute();
        return outcome.getId().getIdPart(); //  It Will Return ID of created patient

    }
}
