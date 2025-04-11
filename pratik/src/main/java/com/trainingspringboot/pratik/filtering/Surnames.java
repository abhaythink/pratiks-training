package com.trainingspringboot.pratik.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SurnamesFilter")
public class Surnames {
    private String surname1;
    private String surname2;
    private String surname3;
    private String surname4;

    public Surnames(String surname1, String surname2, String surname3, String surname4) {
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.surname3 = surname3;
        this.surname4 = surname4;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getSurname3() {
        return surname3;
    }

    public void setSurname3(String surname3) {
        this.surname3 = surname3;
    }

    public String getSurname4() {
        return surname4;
    }

    public void setSurname4(String surname4) {
        this.surname4 = surname4;
    }

    @Override
    public String toString() {
        return "Surnames{" +
                "surname1='" + surname1 + '\'' +
                ", surname2='" + surname2 + '\'' +
                ", surname3='" + surname3 + '\'' +
                ", surname4='" + surname4 + '\'' +
                '}';
    }
}
