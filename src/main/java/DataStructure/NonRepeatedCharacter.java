package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import com.google.common.collect.Multiset.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		String name = "Inzamamul";
		name = name.toLowerCase();

		char[] ch = name.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char i: ch) {
			int flag = 1;
			if(!hm.containsKey(i)) {
				hm.put(i, flag);
			}else {
				hm.put(i, flag+flag++);
			}
		}
		
		for(java.util.Map.Entry<Character, Integer> j:hm.entrySet()) {
			if(j.getValue()==1)
				System.out.println(j.getKey());
		}

	}

}
