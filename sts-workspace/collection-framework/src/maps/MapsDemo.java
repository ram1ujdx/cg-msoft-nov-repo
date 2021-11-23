package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<String, String> trainees=new TreeMap<>();
		
		trainees.put("ananth", "Vijayawada");
		trainees.put("pratiksha", "Akola");
		trainees.put("debleena", "Kolkata");
		trainees.put("leema", "Mangalore");
		trainees.put("ananth", "Kolkata");
		
		
//		String city = trainees.get("leema");
//		System.out.println(city);
		
		for(String name:trainees.keySet()) {
			System.out.println(name+" --- "+trainees.get(name));
		}
		
	}
}
