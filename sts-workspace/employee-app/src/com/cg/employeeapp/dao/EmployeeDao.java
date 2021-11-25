package com.cg.employeeapp.dao;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface EmployeeDao {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByEmail(String email);
	
	public List<Employee> getEmployeesJonedInYear(int year);
	
}
