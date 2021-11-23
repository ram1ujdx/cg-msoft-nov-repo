package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(5,8,2,6,3,9);
		
		System.out.println(nums);
		
		Collections.sort(nums);
		
		System.out.println(nums);
		
		List<String> names=Arrays.asList("Tushar","Ramesh","Suresh","Javed","Harsh");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);

	}

}
