package classesandobjects;

public class TraineeApp {

	
	public boolean isJoinedInSameMonth(Trainee t1, Trainee t2) {
		
		return t1.getJoiningMonth().equalsIgnoreCase(t2.getJoiningMonth());
		
	}
	
	public Trainee[] getTraineesFromAugust(Trainee[] trainees) {
		
		Trainee []augTrainees = new Trainee[trainees.length];
		
		int index=0;
		
		for(Trainee trainee:trainees) {
			if(trainee.getJoiningMonth().equals("August")) {
				augTrainees[index]=trainee;
				index++;
			}
		}
		return augTrainees;
		
	}
	
	public static void main(String[] args) {
		
		
		
		Trainee trainee1 = new Trainee(1002,"Manish","manish@yahoo.com","August");
		
		
		Trainee trainee2 = new Trainee(1002,"Priyanka","priyanka@yahoo.com","July");
		Trainee trainee3 = new Trainee(1003,"Pritam","pritam@yahoo.com","August");
		
		Trainee[] traineeList= {trainee1,trainee2,trainee3};
		
		
		
		TraineeApp obj=new TraineeApp();
		
		Trainee[] augustTrainees = obj.getTraineesFromAugust(traineeList);
		
		for(Trainee t:augustTrainees) {
			if(t!=null) {
			System.out.println(t);
			}
		}

	}

}
