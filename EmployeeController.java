package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp){
		return service.addEmployee(emp);
	
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
		
	}
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp){
		return service.updateEmployee(emp);
	}
	@DeleteMapping("/employee{id}")
	public String deleteEmployee(@PathVariable int id){
		return service.deleteEmployee(id);
		
	}

}
