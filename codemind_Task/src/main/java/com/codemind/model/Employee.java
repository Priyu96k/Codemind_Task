package com.codemind.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_id;
	
	@Column(name = "emp_name")
	private String emp_name; 
	
	@Column(name = "emp_email")
	private String emp_email; 
	
	@Column(name = "emp_department")
	private String emp_department;
	
	@Column(name = "emp_position")
	private String  emp_position; 
	
	@Column(name = "emp_salary")
	private float emp_salary; 
	
	@Column(name = "emp_dateOfJoining")
	private Date  emp_dateOfJoining;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	public String getEmp_position() {
		return emp_position;
	}

	public void setEmp_position(String emp_position) {
		this.emp_position = emp_position;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	public Date getEmp_dateOfJoining() {
		return emp_dateOfJoining;
	}

	public void setEmp_dateOfJoining(Date emp_dateOfJoining) {
		this.emp_dateOfJoining = emp_dateOfJoining;
	}

	public Employee(long emp_id, String emp_name, String emp_email, String emp_department, String emp_position,
			float emp_salary, Date emp_dateOfJoining) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_department = emp_department;
		this.emp_position = emp_position;
		this.emp_salary = emp_salary;
		this.emp_dateOfJoining = emp_dateOfJoining;
	}
	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_email=" + emp_email
				+ ", emp_department=" + emp_department + ", emp_position=" + emp_position + ", emp_salary=" + emp_salary
				+ ", emp_dateOfJoining=" + emp_dateOfJoining + "]";
	}
	
	

	


}
