package com.codemind.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.Repo.EmployeeRepo;
import com.codemind.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String createEmp(Employee employee) {
		employeeRepo.save(employee);
		return "Employee Saved Successfully...";
	}

	@Override
	public List<Employee> readAllEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public String updateEmployee(Long id, Employee newEmp) {
		Employee emp = employeeRepo.findById(id).get();
		emp.setEmp_name(newEmp.getEmp_name());
		emp.setEmp_email(newEmp.getEmp_email());
		emp.setEmp_position(newEmp.getEmp_position());
		emp.setEmp_department(newEmp.getEmp_department());
		emp.setEmp_salary(newEmp.getEmp_salary());
		emp.setEmp_dateOfJoining(newEmp.getEmp_dateOfJoining());
		
		employeeRepo.save(emp);
		
		return "Employee Updated Successfully...";
	}

	@Override
	public boolean deleteEmployee(Long id) {
		Employee emp = employeeRepo.findById(id).get();
		employeeRepo.delete(emp);
		
		return true;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		return emp.orElse(null);
	}

	@Override
	public Page<Employee> getEmployeesByPagination(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return employeeRepo.findAll(pageable);
	}
 
	@Override
	public List<Employee> getEmployeeBySorting(String sortBy) {
		Sort sort = Sort.by(sortBy);
		return employeeRepo.findAll(sort);
	}

}
