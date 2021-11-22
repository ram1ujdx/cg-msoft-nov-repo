package queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// LinkedList Implementation
		// Queue<String> personQueue=new LinkedList<>();
		
		
		// Priority Queue (Sorted)
		Queue<String> personQueue=new PriorityQueue<>();
		
		personQueue.add("Rahul");
		personQueue.add("Suresh");
		personQueue.add("Ramesh");
		personQueue.add("Neel");
		personQueue.add("Nithin");
		personQueue.add("Mukesh");
		
		
		while(!personQueue.isEmpty()) {
			System.out.println(personQueue.peek());
			personQueue.poll();
		}
		
		
		

	}

}
