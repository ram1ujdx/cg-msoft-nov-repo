package classesandobjects;

public class TraineeApp {

	public static void main(String[] args) {
		
		Trainee trainee1 = new Trainee();
		
		trainee1.setTraineeId(-1001);
		trainee1.setTraineeName("Mahesh Dutta");
		trainee1.setEmail("mahesh@yahoo.com");
		
		
		System.out.println(trainee1.getTraineeId());

	}

}
