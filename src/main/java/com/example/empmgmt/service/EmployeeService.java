package com.example.empmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.empmgmt.model.Employee;
import com.example.empmgmt.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private static EmployeeRepository employeeRepository;
	
	// NOTE: Lokes this is where we autowire the repository
	public EmployeeService(EmployeeRepository _repo) {
		employeeRepository = _repo;
	}
	
	public Employee createNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployee(Integer empId) {
		return employeeRepository.findById(empId);
	}
	
	public Employee updateEmployee(Integer empId, Employee employee) {
		Optional<Employee> currentEmp = employeeRepository.findById(empId);
		if(!currentEmp.isPresent()) {
			return new Employee();
		}
		
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
	}
}
