package methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MathOperation obj = new MathOperation();
		
		obj.add(10, 20);
		
		obj.add(10, 16, 30);
	}
	
	
}


class MathOperation{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
}