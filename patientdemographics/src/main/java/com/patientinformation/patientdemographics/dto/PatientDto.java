package com.patientinformation.patientdemographics.dto;

import com.patientinformation.patientdemographics.entity.Patient;
import jakarta.annotation.Nonnull;
import org.springframework.lang.NonNull;

import java.util.Date;

public class PatientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String nameSuffix;
    private String previousName;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private String race;
    private String ethnicity;
    private String tribalAffiliation;
    private String sex;
    private String sexualOrientation;
    private String genderIdentity;
    private String preferredLanguage;
    private String currentAddress;
    private String previousAddress;
    private String phoneNumber;
    private String phoneNumberType;
    private String email;

    private RelatedPersonDto relatedPerson;

    private OccupationDto occupation;

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getTribalAffiliation() {
        return tribalAffiliation;
    }

    public void setTribalAffiliation(String tribalAffiliation) {
        this.tribalAffiliation = tribalAffiliation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public String getGenderIdentity() {
        return genderIdentity;
    }

    public void setGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPreviousAddress() {
        return previousAddress;
    }

    public void setPreviousAddress(String previousAddress) {
        this.previousAddress = previousAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RelatedPersonDto getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPersonDto relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public OccupationDto getOccupation() {
        return occupation;
    }

    public void setOccupation(OccupationDto occupation) {
        this.occupation = occupation;
    }

    public Patient toPatient() {
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setMiddleName(middleName);
        patient.setNameSuffix(nameSuffix);
        patient.setPreviousName(previousName);
        patient.setDateOfBirth(dateOfBirth);
        patient.setDateOfDeath(dateOfDeath);
        patient.setRace(race);
        patient.setEthnicity(ethnicity);
        patient.setTribalAffiliation(tribalAffiliation);
        patient.setSex(sex);
        patient.setSexualOrientation(sexualOrientation);
        patient.setGenderIdentity(genderIdentity);
        patient.setPreferredLanguage(preferredLanguage);
        patient.setCurrentAddress(currentAddress);
        patient.setPreviousAddress(previousAddress);
        patient.setPhoneNumber(phoneNumber);
        patient.setPhoneNumberType(phoneNumberType);
        patient.setEmail(email);
        return patient;
    }



}
