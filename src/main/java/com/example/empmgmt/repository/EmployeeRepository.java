package com.example.empmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empmgmt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
