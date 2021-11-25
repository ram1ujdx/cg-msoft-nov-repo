package streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonNames {

	public static void main(String[] args) {
		
		
		Stream<String> names = Stream.of("Rohit","Mahesh","Suresh","Rajesh","Rajni");
		
		
		// Find the names starts with R
		
		Stream<String> namesWithR = names.filter(name->name.startsWith("R"));
		
		// Convert the names to upper cases
		
		Stream<String> namesUpperCase = namesWithR.map(String::toUpperCase);
		
		// Collect to a List
		
		List<String> outputList = namesUpperCase.collect(Collectors.toList());
		
		// Display Names
		
		outputList.forEach(System.out::println);
		

	}

}
