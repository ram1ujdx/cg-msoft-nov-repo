package streamapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class EmployeeOperations {

	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<>();
		
		
		employeeList.add(new Employee(1001, "Mohit", "Sharma", "sharmamohit@yahoo.com", 42000, LocalDate.of(2000, 2, 21)));
		employeeList.add(new Employee(1002, "Anil", "Reddy", "anil@yahoo.com", 52000,LocalDate.of(2015, 5, 21)));
		employeeList.add(new Employee(1005, "Rajesh", "Dutta", "drajesh@yahoo.com", 58000,LocalDate.of(2010, 2, 15)));
		employeeList.add(new Employee(1003, "Rishitha", "Sharma", "sharmarishitha@yahoo.com", 48000,LocalDate.of(2016, 2, 6)));
		employeeList.add(new Employee(1004, "Tushar", "Mishra", "mtushar@yahoo.com", 35000, LocalDate.of(2005, 4, 16)));
		

//		Exercise 1
		
//		double total=employeeList.stream().mapToDouble(emp->emp.getSalary()).sum();
		
//		double total=employeeList.stream().map(emp->emp.getSalary()).reduce((sal,sum)->sal+sum).get();
//		
//		System.out.println(total);
//		
		
//		Exercise 3		
//		Comparator<Employee> sortByHireDate = (e1,e2)->e1.getHiredaDate().compareTo(e2.getHiredaDate());
//
//		Employee emp = employeeList.stream()
//						.sorted(sortByHireDate)
//						.findFirst().get();
//		
//		System.out.println(emp);
		

//		Exercise 8
		
//		employeeList.stream().map(e->{
//			float salary=e.getSalary();
//			salary=salary + (salary/100)*15;
//			
//			System.out.println(e.getFirstName()+"\t"+e.getSalary()+"\t"+salary);
//			e.setSalary(salary);
//			return e;
//			})
//			.forEach(e->System.out.println());
		
		// Count employees whose salary>40000
		
		
//		int count = (int)employeeList.stream().filter(e->e.getSalary()>40000).count();
//		
//		System.out.println(count);
		
		
		// Joined before 2010 (2010-12-31) in desc order
		
//		LocalDate date = LocalDate.of(2010, 12, 31);
//		
//		employeeList.stream().filter(e->e.getHiredaDate().isBefore(date)).forEach(e->System.out.println(e));
		
//		Comparator<Employee> sortByHireDateDesc = (e1,e2)->e2.getHiredaDate().compareTo(e1.getHiredaDate());
//		
//		employeeList.stream().filter(e->e.getHiredaDate().getYear()<=2010)
//							.sorted(sortByHireDateDesc)
//							.forEach(e->System.out.println(e));
		
		
		
//		Method Reference
		
		
//		employeeList.forEach(System.out::println);
		
		
	}

}
