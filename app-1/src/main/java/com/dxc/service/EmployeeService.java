package com.dxc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.entity.Employee;
import com.dxc.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public List<Employee> addEmployees(List<Employee> employees) {
		return repo.saveAll(employees);
	}

	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = new ArrayList<Employee>();
		repo.findAll().forEach(emps->employees.add(emps));
		return employees;
	}

	public Employee getEmployeeById(long id) {
		return repo.findById(id).get();
	}


	
}
