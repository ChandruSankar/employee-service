package com.example.empmgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empmgmt.model.Employee;
import com.example.empmgmt.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	private static EmployeeService employeeService; 
	
	public EmployeeController(EmployeeService _service) {
		employeeService = _service;
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{empId}")
	public Optional<Employee> getOneEmployee(
			@PathParam("empId") Integer id
	) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/create")
	public Employee createNewEmployee(
			@Validated 
			@RequestBody 
			Employee employee
	) {
		return employeeService.createNewEmployee(employee);
	}
}
