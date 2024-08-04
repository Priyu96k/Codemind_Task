package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.model.Employee;
import com.codemind.services.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/employees")

@CrossOrigin("http://localhost:8080")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;


	@PostMapping("") // For Save Employee in Database
	public String createEmployee(@RequestBody Employee employee) {

		return employeeServiceImpl.createEmp(employee);
	}

	@GetMapping("") // Get the All Employees List
	public List<Employee> readAllEmployee() {
		
		return employeeServiceImpl.readAllEmployee();
	}

	@PutMapping("/{id}") // update the employee record
	public String updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {

		return employeeServiceImpl.updateEmployee(id, emp);
	}

	@DeleteMapping("/{id}") // delete the employee
	public String deleteEmployee(@PathVariable Long id) {
		
		if (employeeServiceImpl.deleteEmployee(id)) {
			return "Employee Deleted Successfully...";
		} else {
			return "Employee Not Found...";
		}
	}
	
	
	@GetMapping("/{id}") // get employee by id for updating
	public Employee geEmployeeById(@PathVariable Long id) {
		return employeeServiceImpl.getEmployeeById(id);
	}
	
	
	

}
