package streamapi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperations {

	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<>();
		
		
		employeeList.add(new Employee(1001, "Mohit", "Sharma", "sharmamohit@yahoo.com", 42000));
		employeeList.add(new Employee(1002, "Anil", "Reddy", "anil@yahoo.com", 52000));
		employeeList.add(new Employee(1005, "Rajesh", "Dutta", "drajesh@yahoo.com", 58000));
		employeeList.add(new Employee(1003, "Rishitha", "Sharma", "sharmarishitha@yahoo.com", 48000));
		employeeList.add(new Employee(1004, "Tushar", "Mishra", "mtushar@yahoo.com", 35000));
		
		
//		double total=employeeList.stream().mapToDouble(emp->emp.getSalary()).sum();
		
		double total=employeeList.stream().map(emp->emp.getSalary()).reduce((sal,sum)->sal+sum).get();
		
		System.out.println(total);
		
		

	}

}
