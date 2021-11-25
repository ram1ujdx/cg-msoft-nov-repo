package com.cg.employeeapp;

import java.util.Scanner;

import com.cg.employeeapp.ui.EmployeeAppUi;

public class EmployeeAppMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		EmployeeAppUi appUi=new EmployeeAppUi();
		int option=0;
		do {
		
		System.out.println("Welcome to EmployeeApp");
		
		System.out.println("1 - Add new Employee");
		System.out.println("2 - Search an Employee");
		System.out.println("3 - Delete an Employee");
		System.out.println("4 - Update Employee");
		System.out.println("5 - View All Employees");
		System.out.println("0 - Exit");
		
		System.out.print("Choose an Option : ");
		
		option = scanner.nextInt();
		
		switch(option) {
		case 1:
			appUi.addEmployee();
			break;
		case 2:	
			appUi.searchEmployee();
			break;
		case 3:
			appUi.deleteEmployee();
			break;
		case 4:	
			appUi.updateEmployee();
			break;
		case 5:
			appUi.viewAllEmployees();
			break;
			
		case 6:
			break;
	
		default:
			break;
				
		}
		
		}while(option!=0);
		
		

	}

}
