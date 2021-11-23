package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.Trainee;

public class SetOfTrainees {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee(1001,"Tushar","tushar@yahoo.com","January");
		Trainee t2=new Trainee(1003,"Kumar","kumar@yahoo.com","July");
		Trainee t3=new Trainee(1002,"Rishita","rishita@yahoo.com","August");
		Trainee t4=new Trainee(1002,"Rishita","rishita@yahoo.com","August");
		Trainee t5=new Trainee(1002,"Rishita","rishita@yahoo.com","August");
		
		Set<Trainee> traineeSet=new HashSet<>();
		
		traineeSet.add(t1);
		traineeSet.add(t2);
		traineeSet.add(t3);
		traineeSet.add(t4);
		traineeSet.add(t5);
		
		
		for(Trainee trainee:traineeSet) {
			System.out.println(trainee);
		}
		
		System.out.println("Search Trainee By ID:");
		System.out.println("------------------------");
		System.out.println("Enter trainee id: ");
		
		int id=new Scanner(System.in).nextInt();
		Trainee searchTrainee=null;
		
		for(Trainee trainee:traineeSet) {
			if(trainee.getTraineeId()==id) {
				searchTrainee=trainee;
				break;
			}
		}
		System.out.println(searchTrainee);
		

	}
	
	
	
	

}
