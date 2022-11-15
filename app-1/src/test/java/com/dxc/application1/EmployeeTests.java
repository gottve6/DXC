package com.dxc.application1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.dxc.entity.Employee;
import com.dxc.repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeTests {

	@Autowired
	private EmployeeRepository repository;
	
	/*
	 * @Test public void testCreateEmployee() { Employee emp = new Employee(101L,
	 * "venkat", 12345, 1000); Employee emps = repository.save(emp);
	 * 
	 * 
	 * }
	 */
	
	
}
