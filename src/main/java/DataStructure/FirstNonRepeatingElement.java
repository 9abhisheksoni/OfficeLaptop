package DataStructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		FirstNonRepeatingElement obj = new FirstNonRepeatingElement();
		System.out.println(obj.methodFirstNonRepeating("Inzamamul"));
	}

	public Character methodFirstNonRepeating(String str) {

		char[] ch = str.toCharArray();

		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

		for (char i : ch) {
			if (!lhm.containsKey(i)) {
				lhm.put(i, 1);
			} else {
				lhm.put(i, lhm.get(i) + 1);
			}
		}
		
		for (Map.Entry<Character, Integer> j : lhm.entrySet()) {
			if (j.getValue() == 1) {
				return j.getKey();
			}
		}
		return null;
	}

}
