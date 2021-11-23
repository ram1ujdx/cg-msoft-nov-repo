package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Trainee;

public class ListOfTrainees {

	public static void main(String[] args) {
		
		List<Trainee> traineeList=new ArrayList<>();
		
		
		Trainee t1=new Trainee(1001,"Tushar","tushar@yahoo.com","January");
		Trainee t2=new Trainee(1003,"Kumar","kumar@yahoo.com","July");
		Trainee t3=new Trainee(1002,"Rishita","rishita@yahoo.com","August");
		
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t3);
		System.out.println("Before Sorting - ");
		
		for(Trainee trainee:traineeList) {
			System.out.println(trainee);
		}
		
		
		
		Collections.sort(traineeList);
		
		System.out.println("After Sorting - ");
		
		for(Trainee trainee:traineeList) {
			System.out.println(trainee);
		}
		
//		CompareByName byName=new CompareByName();
//		Collections.sort(traineeList,byName);
//		
//		System.out.println("After Sorting By Name - ");
//		
//		for(Trainee trainee:traineeList) {
//			System.out.println(trainee);
//		}
		
		
//		Comparator<Trainee> byEmail=(tr1,tr2)->tr1.getEmail().compareTo(tr2.getEmail());
		
		Collections.sort(traineeList,(tr1,tr2)->tr1.getEmail().compareTo(tr2.getEmail()));
		
		System.out.println("After Sorting By Email - ");
		
		for(Trainee trainee:traineeList) {
			System.out.println(trainee);
		}
		

	}

}

class CompareByName implements Comparator<Trainee>{
	@Override
	public int compare(Trainee t1, Trainee t2) {
		return t1.getTraineeName().compareTo(t2.getTraineeName());
	}
}
