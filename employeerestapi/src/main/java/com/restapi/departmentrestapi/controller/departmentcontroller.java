package com.restapi.departmentrestapi.controller;

import com.restapi.departmentrestapi.entity.Department;
import com.restapi.departmentrestapi.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class departmentcontroller {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/departments")
    public List<Department> getAllDept() {
        List<Department> allDepartments = departmentRepository.findAll();
        return allDepartments;
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        Department department = departmentRepository.findById(id).get();
        return department;
    }


    @PostMapping("/department/add")
    //used for giving the different status codes
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
    }

    @PutMapping("department/update/{id}")
    public Department updateDepartment(@PathVariable int id) {
        Department updatedDepartment = departmentRepository.findById(id).get();
        updatedDepartment.setName("Catering");
        updatedDepartment.setLocation("Kolhapur");
        departmentRepository.save(updatedDepartment);
        return updatedDepartment;
    }


    @DeleteMapping("/department/delete/{id}")
    public Department deleteDepartment(@PathVariable int id) {
        Department deleteDepartment = departmentRepository.findById(id).get();
        departmentRepository.delete(deleteDepartment);
        return deleteDepartment;
    }


}
