package lambdas;

public class AppMain {

	public static void main(String[] args) {
		
//		Showable obj = new Showable() {
//					public void showMessage(String message) {
//						System.out.println(message);
//					}
//			};
//			
//			
//		obj.showMessage("Hi there...");
		
		
		Showable obj = message -> {
							System.out.println(message);
							};
			
	
		obj.showMessage("Hi there...");
		
		

	}

}
