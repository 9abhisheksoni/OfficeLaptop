package Looping;

import java.util.HashMap;

public class ReverseAStringWithHashMap {

	public static void main(String[] args) {
		
		String a = "nitin";
		char[] b = a.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();		
		
		for(Character i: b) {
			int flag = 1;
			
			if(!hm.containsKey(i)) {
				hm.put(i,flag);
			}else{
				hm.put(i, flag++);
				System.out.println(i);
			}
			
		}
		
	}
	
}
