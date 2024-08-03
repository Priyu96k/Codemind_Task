package com.codemind.services;

import java.util.List;
import com.codemind.model.Employee;


public interface EmployeeService {
	
	String createEmp(Employee employee);
	
	List<Employee> readAllEmployee();
	
	String updateEmployee(Long id, Employee employee);
	
	boolean deleteEmployee(Long id);
	
	Employee getEmployeeById(Long id);
	
	

}

