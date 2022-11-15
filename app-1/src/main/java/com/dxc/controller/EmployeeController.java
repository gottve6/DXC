package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.Employee;
import com.dxc.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public Long addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return employee.getId();
	}
	@PostMapping("/createAll")
	public List<Employee> addEmployees(List<Employee> employees){
		return service.addEmployees(employees);
	}
	
	@GetMapping("/readAll")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@GetMapping("/read/{id}")
	public Employee getEmployeeById(@PathVariable("id") long id) {
		return service.getEmployeeById(id);
	}

}
