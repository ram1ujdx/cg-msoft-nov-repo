package defaultandstaticmethods;


public class InterfaceDemo {

	public static void main(String[] args) {
		Calc add = (a,b)->{
							
							return a+b;
						};
						
		int sum = add.calculate(5, 10);
		System.out.println("Sum = "+sum);
		
		Calc subtract = (a,b)->a-b;
		int difference = subtract.calculate(5, 10);
		System.out.println("Difference = "+difference);
		
	}

}

interface Calc{
	int calculate(int a, int b);
	
	default void show() {
		System.out.println("Default Method..");
	}
	
	static void fun() {
		System.out.println("Have fun..");
	}
}




