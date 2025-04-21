package com.patientinformation.patientdemographics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PatientdemographicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientdemographicsApplication.class, args);
	}

}
