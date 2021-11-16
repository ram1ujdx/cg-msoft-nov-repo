import java.util.Scanner;

class MyFirstProgram{
	
	public static void main(String []args){
	
			Scanner scan = new Scanner(System.in);	

			

			System.out.print("Enter value of Num 1: ");	
			int num1 = scan.nextInt();
			System.out.print("Enter value of Num 2: ");	
			int num2= scan.nextInt();
			float result = (float)num1/(float)num2;

			System.out.print("Enter Your Name : ");
			String name = scan.next() + scan.nextLine();

			System.out.println("Welcome "+name);
			
			System.out.println("Result = " +result);


	}
}

