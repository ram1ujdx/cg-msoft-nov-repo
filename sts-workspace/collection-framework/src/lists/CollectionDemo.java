package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
	
		//Collection<Object> items=new ArrayList<>();
		//List<Object> items=new ArrayList<>();
		
		List<Object> items=new LinkedList<>();
		
		items.add(5);
		items.add("Rahul");
		items.add(5.6);
		items.add(true);
		items.add("Rahul");
		items.add(5.6);
		items.add(true);
		items.add("Rahul");
		items.add(5.6);
		items.add(true);
		
		// Approach 1 - Iterator
		
//		Iterator<Object> iter=items.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
//		Approach 2 - Using index number (Only for List)
		
//		for(int i=0; i<items.size(); i++) {
//			System.out.println(items.get(i));
//		}
		
		
		// Approach 3 - enhanced for loop
		
//		for(Object item:items) {
//			System.out.println(item);
//		}
		
		// Approach 4 - forEach()[Java 8]
		
//		items.forEach(System.out::println);
		
//		System.out.println(items.contains("Rahul"));
		
//		items.add(2, "Javeed");
		
		// Removing an Element
		
//		items.remove("Rahul");
		items.remove((Object)5);
//		System.out.println("After Removing");
		items.forEach(System.out::println);

	}

}
