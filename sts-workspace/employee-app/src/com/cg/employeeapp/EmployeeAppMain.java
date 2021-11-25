package com.cg.employeeapp;

import java.util.Scanner;

import com.cg.employeeapp.ui.EmployeeAppUi;

public class EmployeeAppMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		EmployeeAppUi appUi=new EmployeeAppUi();
		
		System.out.println("Welcome to EmployeeApp");
		
		System.out.println("1 - Add new Employee");
		System.out.println("2 - Search an Employee");
		System.out.println("3 - ...");
		
		System.out.print("Choose an Option : ");
		
		int option = scanner.nextInt();
		
		switch(option) {
		case 1:
			appUi.addEmployee();
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
				
		}
		
		

	}

}
