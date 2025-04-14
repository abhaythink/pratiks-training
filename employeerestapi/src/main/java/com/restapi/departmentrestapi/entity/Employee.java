package com.restapi.departmentrestapi.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;


    @Column(name = "emp_name")
    @NotNull
    private String firstName;


    @Column(name = "emp_surname")
    @NotNull
    private String lastName;


    @Column(name = "emp_name")
    @NotNull
    private String email;


    @Column(name = "emp_salary")
    @NotNull
    private int salary;


    public Employee(){

    }

    public Employee(int emp_id, String email, String lastName, String firstName, int salary) {
        this.emp_id = emp_id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emplyoee{" +
                "emp_id=" + emp_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
