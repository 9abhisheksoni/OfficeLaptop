package DataStructure;

import java.util.HashSet;

public class DuplicateUsingHashSet {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 40 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i : a) {
			if (!hs.add(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println(hs);
	}
}
