package com.restapi.departmentrestapi.repository;

import com.restapi.departmentrestapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
