package classesandobjects;

public class Trainee {

	private int traineeId;
	private String traineeName;
	private String email;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		if(traineeId<=0) {
		System.out.println("Invalid Trainee Id");
		System.exit(1);
		}
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
