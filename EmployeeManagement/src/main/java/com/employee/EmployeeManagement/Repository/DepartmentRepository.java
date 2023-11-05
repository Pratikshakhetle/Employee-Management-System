package com.employee.EmployeeManagement.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.EmployeeManagement.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {

	
}
