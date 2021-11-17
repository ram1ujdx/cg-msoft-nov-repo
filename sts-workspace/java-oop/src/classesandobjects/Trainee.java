package classesandobjects;

public class Trainee {

	private int traineeId;
	private String traineeName;
	private String email;
	private String joiningMonth;
	
	
	public Trainee() {
		
	}

	

	
	


	








	public Trainee(int traineeId, String traineeName, String email, String joiningMonth) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.email = email;
		this.joiningMonth = joiningMonth;
	}















	public String getJoiningMonth() {
		return joiningMonth;
	}















	public void setJoiningMonth(String joiningMonth) {
		this.joiningMonth = joiningMonth;
	}















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
















	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", email=" + email
				+ ", joiningMonth=" + joiningMonth + "]";
	}
	
	
	
	
	
	
	
}
