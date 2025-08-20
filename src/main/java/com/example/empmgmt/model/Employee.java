package com.example.empmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Employee {
	@Id
	Integer empId;
	String name;
	Integer age;
	Integer salary;
}
