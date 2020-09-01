package Looping;

public class Pyramid {

	public static void main(String[] args) {

		String space = " ";
		String star = "*";
		
		for(int i=1; i<=4; i++) {
			for(int j=4-1; j>=i; j--) {
				System.out.print(space);
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print(star);
			}
			
			System.out.println();
		}
		
	}

}
