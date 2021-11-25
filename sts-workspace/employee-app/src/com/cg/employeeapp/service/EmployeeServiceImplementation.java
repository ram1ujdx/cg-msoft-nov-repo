package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.dao.EmployeeDao;
import com.cg.employeeapp.dao.EmployeeDaoImplementation;
import com.cg.employeeapp.model.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
	
	EmployeeDao dao;
	
	public EmployeeServiceImplementation() {
		dao = new EmployeeDaoImplementation();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		return dao.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}
	
	

}
