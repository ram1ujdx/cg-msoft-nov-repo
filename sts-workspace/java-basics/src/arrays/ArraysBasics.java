package arrays;

import java.util.Scanner;

public class ArraysBasics {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Total No. of elements : ");
		int size = scan.nextInt();
		
		int []nums = new int[size];
		
		System.out.println("Input "+size+" Values : ");
		
		for(int i=0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		
		
//		int []nums = new int[] {5,2,6,7,9};
		
		
		
//		for(int i=0; i < nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		}
		
		System.out.println("After Reading : ");
		
		for(int item : nums) {
			System.out.println(item);
		}
		

	}

}
