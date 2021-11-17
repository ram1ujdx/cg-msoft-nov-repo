package classesandobjects;

public class ClockMonitor {

	public static void main(String[] args) {
		
		Clock clock1 = new Clock();
		
		Clock clock2=new Clock(10,29,30);
		
		Clock clock3 = new Clock(600);
		
		System.out.println(clock1);
		System.out.println(clock2);
		System.out.println(clock3);
		
		

	}

}
