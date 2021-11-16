package looping;

import java.util.Scanner;

public class AverageFinder {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		
		float avg = 0;
		float sum = 0;
		int num = 0;
		
		int counter = 0;
		System.out.println("Enter values: ");
		while(num != -1) {
			num = scan.nextInt();
			if(num == -1) {
				break;		// Stop execution if -1 is entered 
			}
			if(num <= 0) {
				continue;  // Skips any negative values
			}
			sum = sum + num;
			counter++;
			
			
		}
		
		avg=sum/counter;
		
		System.out.println("Average = "+avg);
		
		
		

	}

}
