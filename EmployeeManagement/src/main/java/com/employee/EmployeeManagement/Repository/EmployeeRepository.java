package com.employee.EmployeeManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.EmployeeManagement.model.Employee;

	public interface EmployeeRepository extends JpaRepository<Employee, Long> {

		List<Employee> getAllEmployees();

		Employee createEmployee(Employee employee);

		Employee updateEmployee(Long id, Employee employee);

		boolean deleteEmployee(Long id);

		Employee getEmployeeById(Long id);

		
		
	}
	


