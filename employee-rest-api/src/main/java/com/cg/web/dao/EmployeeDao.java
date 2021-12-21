package com.cg.web.dao;

import java.util.List;

import com.cg.web.model.Employee;

public interface EmployeeDao {
	
	
	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(int employeeId);
	
	public List<Employee> getAllEmployees();
	
	
	public Employee updatreEmployee(Employee employee);
	
	public boolean deleteEmployee(int employeeId);
	

}
