package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamsDemo {

	public static void main(String[] args) {
		
		List<Integer> myList=Arrays.asList(10,15,2,17,4);
		
		// With Stream API
		
		int sum = myList.stream().filter(i->i%2==0).map(i->i*2).reduce((i,s)->i+s).get();
		
		System.out.println("Result ="+sum);
		
		
//		
//		//Without Stream API
//		
//		// Find all the even number
//		
//		List<Integer> evens=new ArrayList<>();
//		for(int num:myList) {
//			if(num%2==0) {
//				evens.add(num);
//			}
//		}
//		
//		// Double each number
//		List<Integer> doubles=new ArrayList<>();
//		for(int num:evens) {
//			doubles.add(num*2);
//		}
//		
//		// Add all
//		int sum=0;
//		for(int num:doubles) {
//			sum+=num;
//		}
//		
//		System.out.println("Result = "+sum);

	}

}
