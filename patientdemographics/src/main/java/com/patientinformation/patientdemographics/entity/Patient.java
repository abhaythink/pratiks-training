package com.patientinformation.patientdemographics.entity;
import com.patientinformation.patientdemographics.dto.OccupationDto;
import com.patientinformation.patientdemographics.dto.RelatedPersonDto;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "name_suffix")
    private String nameSuffix;

    @Column(name = "previous_name")
    private String previousName;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "date_of_death")
    @Temporal(TemporalType.DATE)
    private Date dateOfDeath;

    @Column(name = "race")
    private String race;

    @Column(name = "ethnicity")
    private String ethnicity;

    @Column(name = "tribal_affiliation")
    private String tribalAffiliation;

    @Column(name = "sex")
    private String sex;

    @Column(name = "sexual_orientation")
    private String sexualOrientation;

    @Column(name = "gender_identity")
    private String genderIdentity;

    @Column(name = "preferred_language")
    private String preferredLanguage;

    @Column(name = "current_address")
    private String currentAddress;

    @Column(name = "previous_address")
    private String previousAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "phone_number_type")
    private String phoneNumberType;

    @Column(name = "email")
    private String email;


    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private RelatedPerson relatedPerson;


    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private Occupation occupation;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
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


    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

   public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }


}