package streamapi;

import java.util.stream.Stream;

public class StreamApiBasics {
	
	public static void main(String[] args) {
		
	
	
	Stream<Integer> numberStream = Stream.of(10,15,20,5,7);
	
	// filter
	// map
	// reduce
	// count
	
	Stream<Integer> evens = numberStream.filter((i)->i%2==0);
	
	
	
	int sum = evens.mapToInt(i->i*2).sum();
	
	System.out.println("Sum = "+sum);
	
	
	}

}
