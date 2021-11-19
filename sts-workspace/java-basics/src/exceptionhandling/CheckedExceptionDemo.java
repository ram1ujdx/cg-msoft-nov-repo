package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		File file=new File("myfile.txt");
		
		Scanner scanner=null;
		try {
			System.out.println("Trying to read the file..");
			scanner = new Scanner(file);
			System.out.println(scanner.nextLine());
			// Aline that leads to ArithmeticException
			int x=5/0;
			
		} catch (FileNotFoundException e) {
			System.out.println("Error... "+e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error...");
		}
		finally {
			System.out.println("Finally Block Executed..");
			if(scanner!=null) {
				scanner.close();
			}
		}
		
		
		

	}

}
