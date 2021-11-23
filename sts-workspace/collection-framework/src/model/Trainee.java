package model;

public class Trainee implements Comparable<Trainee> {

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
	
	@Override
	public int compareTo(Trainee trainee) {
		return this.traineeId-trainee.traineeId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((joiningMonth == null) ? 0 : joiningMonth.hashCode());
		result = prime * result + traineeId;
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (joiningMonth == null) {
			if (other.joiningMonth != null)
				return false;
		} else if (!joiningMonth.equals(other.joiningMonth))
			return false;
		if (traineeId != other.traineeId)
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}
	
	// POJO - Plain Old Java Object
	
	// Model Class
	
}
