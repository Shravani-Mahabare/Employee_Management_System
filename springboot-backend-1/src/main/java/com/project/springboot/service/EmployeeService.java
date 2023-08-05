package com.project.springboot.service;

import java.util.List;

import com.project.springboot.model.Employee;

public interface EmployeeService {

	//get all employee
	List<Employee> getAllEmployee();
	
	//get single employee
	Employee getEmployee (Long id);
	
	//create Employee
	Employee createEmployee(Employee emp);
	
	//update Employee
	Employee updateEmployee( Employee emp, Long id);
	
	//delete Employee
	void deleteEmployee(Long id);
	
	
}
