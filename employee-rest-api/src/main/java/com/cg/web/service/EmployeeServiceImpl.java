package com.cg.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.web.dao.EmployeeDao;
import com.cg.web.dao.EmployeeDaoImpl;
import com.cg.web.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao daoObj;

	@Override
	public Employee addEmployee(Employee employee) {
		
		return daoObj.addEmployee(employee);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		
		return daoObj.getEmployee(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return daoObj.getAllEmployees();
	}

	@Override
	public Employee updatreEmployee(Employee employee) {
		return daoObj.updatreEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		return daoObj.deleteEmployee(employeeId);
	}

}
