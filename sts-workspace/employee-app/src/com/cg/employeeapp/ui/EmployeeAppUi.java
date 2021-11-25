package com.cg.employeeapp.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.EmployeeService;
import com.cg.employeeapp.service.EmployeeServiceImplementation;

public class EmployeeAppUi {
	
	Scanner scanner=new Scanner(System.in);
	
	EmployeeService service;
	
	public EmployeeAppUi() {
		service = new EmployeeServiceImplementation();
	}
	
	public void addEmployee() {
		
		System.out.println("Enter Employee Info : ");
		System.out.print("Employee ID : ");
		int employeeId = scanner.nextInt();
		
		System.out.print("First Name : ");
		String firstName = scanner.next()+scanner.nextLine();
		
		System.out.print("Last Name");
		String lastName = scanner.next()+scanner.nextLine();
		
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		
		System.out.print("Salary : ");
		float salary = scanner.nextFloat();
		
		System.out.println("Hire Date (YYYY-MM-DD) : ");
		String dateString=scanner.next()+scanner.nextLine();;
		
		LocalDate hireDate = LocalDate.parse(dateString);
		
		Employee employee = new Employee(employeeId, firstName, lastName, email, salary, hireDate);
		
		Employee savedEmployee = service.addEmployee(employee);
		
		System.out.println("Added Successfully");
		
		System.out.println(savedEmployee);
		
		
	}
	
	public void searchEmployee() {
		
		System.out.println("Enter employee ID : ");
		int empolyeeId = scanner.nextInt();
		
		Employee employee = service.getEmployeeById(empolyeeId);
		
		System.out.println(employee);
		
	}
	
	public void deleteEmployee() {
		
		
		System.out.println("Enter employee ID : ");
		int empolyeeId = scanner.nextInt();
		
		boolean deleted = service.deleteEmployeeById(empolyeeId);
		
		if(deleted) {
			System.out.println("Employee with ID : "+empolyeeId+" is Deleted Successfully");
		}
	}
	
	public void updateEmployee() {
		
		System.out.println("Enter employee ID : ");
		int employeeId = scanner.nextInt();
		
		Employee employee = service.getEmployeeById(employeeId);
		
		if(employee!=null) {
			System.out.println("Enter Employee Details to Update : ");
			
			
			System.out.print("First Name : ");
			String firstName = scanner.next()+scanner.nextLine();
			
			System.out.print("Last Name");
			String lastName = scanner.next()+scanner.nextLine();
			
			System.out.print("Email : ");
			String email=scanner.next()+scanner.nextLine();
			
			System.out.print("Salary : ");
			float salary = scanner.nextFloat();
			
			System.out.println("Hire Date (YYYY-MM-DD) : ");
			String dateString=scanner.next()+scanner.nextLine();;
			
			LocalDate hireDate = LocalDate.parse(dateString);
			
			employee = new Employee(employeeId, firstName, lastName, email, salary, hireDate);
			
			Employee savedEmployee = service.addEmployee(employee);
			
			System.out.println("Updated Successfully");
			
			System.out.println(savedEmployee);
		}
		
	}
	
	
	public void viewAllEmployees() {
		service.getAllEmployees().forEach(System.out::println);
		
	}
	

	

}
