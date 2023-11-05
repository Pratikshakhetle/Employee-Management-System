package com.employee.EmployeeManagement.model;

import java.security.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String departmentid;
    private String departmentName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
	public String getDepartmentId() {
		return departmentid;
	}
	public void setDepartmentId(String id) {
		this.departmentid = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Department(String departmentid, String departmentName, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	

}
