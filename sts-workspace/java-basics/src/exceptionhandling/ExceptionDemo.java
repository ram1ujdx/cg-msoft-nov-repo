package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int x=5;
		int y=0;
		System.out.println("Operation begins..");
		try {
			int z= x/y;  // Exception
			System.out.println("Output = "+z);
		}
		catch (ArithmeticException e) {
			System.err.println("Error!! "+e.getMessage());
		}
		
		System.out.println("Operation Ends..");
		System.out.println("Thank You..");
		
		
		
	}

}
