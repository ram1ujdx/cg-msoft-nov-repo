package maps;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
		
		
		String str="Hello everyone..Whats going on??";
		
		Map<Character, Integer> counts=new HashMap<>();
		
		char[] chars=str.toCharArray();
		
		for(char ch:chars) {
			
			if(counts.containsKey(ch)) {
				int current = counts.get(ch);
				current=current+1;
				counts.put(ch, current);
				
			}
			else {
			counts.put(ch, 1);
			}
			
		}
		
		
		for(char ch:counts.keySet()) {
			System.out.println(ch+" --- "+counts.get(ch));
		}
		
		

	}

}
