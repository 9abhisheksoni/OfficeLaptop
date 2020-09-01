package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class UniqueValuesFromTwoArray {

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40 };
		int[] y = { 20, 30, 50, 60, 10 };

		UniqueValuesFromTwoArray obj = new UniqueValuesFromTwoArray();
		obj.uniqueValues(x, y);
	}

	public void uniqueValues(int[] a, int[] b) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!hm.containsKey(a[i]))
				hm.put(a[i], 1);
			else
				hm.put(a[i], hm.get(a[i]) + 1);
		}
		for(int i = 0; i < b.length; i++) {
			if (!hm.containsKey(b[i]))
				hm.put(b[i], 1);
			else
				hm.put(b[i], hm.get(b[i]) + 1);
		}
		for (Map.Entry<Integer, Integer> k : hm.entrySet()) {
			if (k.getValue() == 1)
				System.out.println(k.getKey());
		}
	}

}
