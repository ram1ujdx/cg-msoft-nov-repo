package com.cg.web.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.web.model.Employee;
import com.cg.web.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService serviceObj;

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int employeeId) {
		
		Employee emp = serviceObj.getEmployee(employeeId);
		
		return emp;
		
	}
	
	// GET POST PUT DELETE
	
	//@RequestMapping(method= {RequestMethod.POST}, value = "/employee")
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return serviceObj.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return serviceObj.getAllEmployees();
	}
	
	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable("id") int employeeId) {
		return serviceObj.deleteEmployee(employeeId);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return serviceObj.updatreEmployee(employee);
	}
	
	
}
