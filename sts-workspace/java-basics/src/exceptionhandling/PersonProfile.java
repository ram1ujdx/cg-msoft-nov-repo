package exceptionhandling;

import java.util.Scanner;

public class PersonProfile {

	public void readPersonInfo()throws InvalidAgeException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name and Age : ");
		String name= scan.nextLine();
		int age=scan.nextInt();
		
		
		if(age<13) {
			throw new InvalidAgeException("Sorry your are not eligible..");
		}
		System.out.println("Entered Details:");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		
	}

}
