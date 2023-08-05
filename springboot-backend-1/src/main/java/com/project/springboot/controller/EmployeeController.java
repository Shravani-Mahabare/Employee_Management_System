package com.project.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.model.Employee;
import com.project.springboot.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeeController {
 @Autowired
	EmployeeService service;
	
	// get all employee
@GetMapping("/getall")
	List<Employee> getAllEmployee() {
       return service.getAllEmployee();
	}

	// get single employee
@GetMapping("/get/{id}")
	Employee getEmployee(@PathVariable Long id) {
      return service.getEmployee(id);
	}

	// create employee
@PostMapping("/create")
	Employee createEmployee(@RequestBody Employee emp) {
      
	return service.createEmployee(emp);
	}

	// update employee
@PutMapping("/update/{id}")
	Employee updateEmployee(@RequestBody Employee emp, @PathVariable Long id) {
	 return service.updateEmployee(emp,id);
	 
	}

	// delete employee
@DeleteMapping("/del/{id}")
	void deleteEmployee(@PathVariable Long id) {
       service.deleteEmployee(id);
	}


}
