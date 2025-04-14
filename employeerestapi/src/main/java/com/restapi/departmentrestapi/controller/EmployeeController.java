package com.restapi.departmentrestapi.controller;

import com.restapi.departmentrestapi.entity.Department;
import com.restapi.departmentrestapi.entity.Employee;
import com.restapi.departmentrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllDept() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

        @PostMapping("/employee/add")
        //used for giving the different status codes
        @ResponseStatus(code = HttpStatus.CREATED)
        public void createEmployee (@RequestBody Employee employee) {
            employeeRepository.save(employee);
        }

        @PutMapping("employee/update/{id}")
        public Employee updateEmployee(@PathVariable("id") int emp_id) {
            Employee updatedEmployee = employeeRepository.findById(emp_id).get();
            updatedEmployee.setFirstName("Sudhir");
            updatedEmployee.setLastName("More");
            employeeRepository.save(updatedEmployee);
            return updatedEmployee;
        }


        @DeleteMapping("/employee/delete/{id}")
        public Employee deleteEmployee(@PathVariable int emp_id) {
            Employee deleteEmployee = employeeRepository.findById(emp_id).get();
            employeeRepository.delete(deleteEmployee);
            return deleteEmployee;
        }

    }

