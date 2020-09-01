package Looping;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Abhishek";
		name = name.toLowerCase();
		char[] ulta = name.toCharArray();
		
		for(int i=ulta.length-1; i>=0; i--) {
			System.out.print(ulta[i]);
		}
		
		
	}

}
