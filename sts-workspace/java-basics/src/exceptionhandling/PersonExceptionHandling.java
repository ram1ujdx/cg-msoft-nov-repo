package exceptionhandling;

public class PersonExceptionHandling {

	public static void main(String[] args) {
		
		PersonProfile profile=new PersonProfile();
		
		try {
			profile.readPersonInfo();
		} catch (Exception e) {
			System.err.println("Error!! "+e);
		}
		

	}

}
