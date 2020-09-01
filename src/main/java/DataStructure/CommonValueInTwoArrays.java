package DataStructure;

import java.util.HashSet;

public class CommonValueInTwoArrays {

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40 };
		int[] y = { 20, 80, 90, 100 };

		CommonValueInTwoArrays cm = new CommonValueInTwoArrays();
		cm.CommonElement(x, y);

	}

	public void CommonElement(int[] a, int[] b) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i : a) {
			hs.add(i);
		}

		System.out.println("Common values in two array are :");

		for (int j : b) {
			if (!hs.add(j)) {
				System.out.println(j);
			}
		}
	}

}
