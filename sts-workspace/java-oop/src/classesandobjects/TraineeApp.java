package classesandobjects;

public class TraineeApp {

	
	public static boolean isJoinedInSameMonth(Trainee t1, Trainee t2) {
		
		return t1.getJoiningMonth().equalsIgnoreCase(t2.getJoiningMonth());
		
	}
	
	public static void main(String[] args) {
		
		Trainee trainee1 = new Trainee(1002,"Manish","manish@yahoo.com","July");
		
		
		Trainee trainee2 = new Trainee(1002,"Priyanka","priyanka@yahoo.com","JULY");
		
		
		
		System.out.println(isJoinedInSameMonth(trainee1, trainee2));

	}

}
