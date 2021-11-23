package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Trainee;

public class MapOfTrainees {

	public static void main(String[] args) {
		
		Map<Integer, Trainee> traineeMap=new HashMap<>();
		
		Trainee t1=new Trainee(1001,"Tushar","tushar@yahoo.com","January");
		Trainee t2=new Trainee(1003,"Kumar","kumar@yahoo.com","July");
		Trainee t3=new Trainee(1002,"Rishita","rishita@yahoo.com","August");
		
		traineeMap.put(t1.getTraineeId(), t1);
		traineeMap.put(t2.getTraineeId(), t2);
		traineeMap.put(t3.getTraineeId(), t3);
		
		System.out.println("Search Trainee By ID:");
		System.out.println("------------------------");
		System.out.println("Enter trainee id: ");
		
		int id=new Scanner(System.in).nextInt();
		Trainee searchTrainee=traineeMap.get(id);
		
		
		System.out.println(searchTrainee);
		
		
		
		

	}

}
