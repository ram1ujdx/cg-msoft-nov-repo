package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
	//	Set<String> names = new HashSet<>();
	
		// TreeSet  -- Items will be sorted
		
		// Set<String> names = new TreeSet<>();
		
		// LinkedHashSet - will follow insertion order
		
		Set<String> names = new LinkedHashSet<>();
		
		names.add("Rahul");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Neel");
		names.add("Nithin");
		names.add("Mukesh");
		names.add("Rahul");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Rahul");
		names.add("Suresh");
		names.add("Ramesh");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
		

	}

}
