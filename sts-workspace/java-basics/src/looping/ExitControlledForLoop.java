package looping;

public class ExitControlledForLoop {

	public static void main(String[] args) {
		
		
		int counter = 100;
		
		for( ;  ; ) {
			System.out.println("Hello..");
			if(counter>=5) {
				break;
			}
			counter++;
			
			
		}

	}

}
