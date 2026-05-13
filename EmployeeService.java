package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;

	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}
	public List<Employee> getEmployees() {
		
		return repo.findAll();
	}
	public Employee getEmployee(int id) {
		return repo.findById(id).orElse(null);
	}
	public Employee updateEmployee(Employee emp) {
		return repo.save(emp);
	}
	public String deleteEmployee(int id) {
		repo.deleteById(id);
		return "Employee Deleted successfully";
	}


	}


