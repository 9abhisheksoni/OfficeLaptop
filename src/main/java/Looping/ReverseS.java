package Looping;

import java.util.Scanner;

public class ReverseS {

	public static void main(String[] args) {

		String s = "abhishek";
		char[] c = s.toCharArray();
		
		
		for(int i=c.length-1 ; i>=0; i--) {
			System.out.print(c[i]);
		}
		
		
		
	}

}
